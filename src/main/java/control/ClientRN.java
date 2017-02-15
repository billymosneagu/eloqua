/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ContactoRN;
import model.Response;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Billy
 */
public class ClientRN {
    
    
    
    /**
     * Manda una peticion para que le devuelva un json con todos los contactos, guardando cada linea en un arraylist.
     * 
     * @return 
     */
    public ArrayList<ContactoRN> getInfo() {
        ArrayList<String> cadena = new ArrayList<>();
        try {
            URL url = new URL("https://cloudsupport.rightnowdemo.com/services/rest/connect/v1.3/contacts");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            
            urlConnection.setRequestProperty("Authorization", "Basic " + PropertiesAcces.rnenc());
             
            InputStream is = urlConnection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = rd.readLine()) != null) {
                cadena.add(line);
            }

            rd.close();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getContacts(cadena);
    }
    /**
     * De el anterior arraylist que almacena el json recogemos solo los ids y guardamos en otra lista los contactos  con dicho id
     * y que tengan un email.
     * @param cadena
     * @return 
     */
    public ArrayList<ContactoRN> getContacts(ArrayList<String> cadena) {
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<ContactoRN> contactos = new ArrayList<>();
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i).contains('"' + "id" + '"' + ":")) {
                String linea = cadena.get(i);
                linea = linea.substring(linea.indexOf(":") + 1);
                linea = linea.substring(0, linea.indexOf(","));
                linea = linea.replaceAll("\\s", "");
                int id = Integer.valueOf(linea);
                ids.add(id);
                String email=getEmail(id);
                if(email!=null){
                    ContactoRN contact=getContacto(id);
                    contact.setEmail(email);
                    contactos.add(contact);
                }
                
            }

        }
       
        return contactos;
    }
    /**
     * Devuelve el email a partir del id de contacto
     * @param id
     * @return 
     */
    public String getEmail(int id) {
        String email = null;
        try {
            URL url = new URL("https://cloudsupport.rightnowdemo.com/services/rest/connect/v1.3/contacts/" + id + "/emails/0");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            
            urlConnection.setRequestProperty("Authorization", "Basic " + PropertiesAcces.rnenc());
            InputStream is = urlConnection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = rd.readLine()) != null) {
                if ((line.contains('"' + "address" + '"' + ":")) && (!line.contains("invalid"))) {

                    line = line.substring(line.indexOf(":") + 1);
                    line = line.substring(0, line.indexOf(","));
                    line = line.replaceAll("\\s", "");
                    line = line.substring(line.indexOf('"') + 1);
                    line = line.substring(0, line.indexOf('"'));
                    email = line;

                }

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            System.out.println("Email no disponible para id " + id);
        } catch (IOException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);

        }
        return email;
    }
    /**
     * Devuelve el contacto a partir de su id.
     * @param id
     * @return 
     */
    public ContactoRN getContacto(int id) {
        String email = null;
        ContactoRN contacto=null;
        try {
            URL url = new URL("https://cloudsupport.rightnowdemo.com/services/rest/connect/v1.3/contacts/" + id);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            
            urlConnection.setRequestProperty("Authorization", "Basic " + PropertiesAcces.rnenc());
            InputStream is = urlConnection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));

            String line;
            String json="";
            while ((line = rd.readLine()) != null) {
                
                //line = line.replaceAll("\\s", "");
                json=json+line;
            }
            
            ObjectMapper mapper=new ObjectMapper();
            contacto=mapper.readValue(json, ContactoRN.class);
            contacto.setEmail(getEmail(id));
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            ;
        } catch (IOException ex) {
            Logger.getLogger(ClientRN.class.getName()).log(Level.SEVERE, null, ex);

        }
        return contacto;
    }

}
