/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import model.ResponseSegment;

/**
 *
 * @author Billy
 */
public class Client {

    private String _authToken;
    private String _baseUrl;

    public Client() {
        _baseUrl = PropertiesAcces.urlloqua();

        _authToken = "Basic " + PropertiesAcces.encloqua();
    }

    public String get(String uri) {
        return this.execute(uri, "GET", null);
    }

    public String post(String uri, String body) {
        return this.execute(uri, "POST", body);
    }

    public String put(String uri, String body) {
        return this.execute(uri, "PUT", body);
    }

    public void delete(String uri) {
        this.execute(uri, "DELETE", null);
    }

    public String execute(String uri, String method, String body) {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.1", 8080));
        
        String json="";
        try {
            URL url = new URL(_baseUrl + uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod(method);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", _authToken);

            if ("PUT".equals(method) || "POST".equals(method)) {
                conn.setDoOutput(true);
                final OutputStream os = conn.getOutputStream();
                os.write(body.getBytes());
                os.flush();
                os.close();
            }

            InputStream is = conn.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = rd.readLine()) != null) {
//                System.out.println(line+'\n');
//                response.body += line;
                json=json+line;
            }
            rd.close();

            
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        return json;
    }
}
