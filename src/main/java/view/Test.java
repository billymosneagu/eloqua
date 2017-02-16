/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import control.Client;
import control.ClientRN;
import control.Control;
import control.PropertiesAcces;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.C_Contact;
import model.Contact;
import model.ContactEloqua;
import model.ContactoRN;
import model.ResponseContacts;
import model.ResponseSegment;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONObject;

/**
 *
 * @author Billy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    //Se ha conseguido añadir contactos a la base de datos de eloqua
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       Client c=new Client();
//      
        ObjectMapper mapper=new ObjectMapper();
        Gson gson= new Gson();

//String s="{"+'"'+"filter"+'"'+": "+'"'+"EXISTS('"+"{{ContactSegment[5]}}"+"')"+'"'+"}";
//   /data/contact/view/100007/contacts/segment/2
//           String json=c.get("/data/contact/view/100007/contacts/segment/2");
//            
//           System.out.println(json);
//        
//            ResponseSegment response=gson.fromJson(json, ResponseSegment.class);//mapper.readValue(json, ResponseSegment.class);
//            
//            C_Contact[] contactlist=response.getElements();
//            for(int i=0;i<contactlist.length;i++){
//                System.out.println(contactlist[i].toString());
//            }
//          ContactEloqua contacto=gson.fromJson(c.get("/data/contact/7"), ContactEloqua.class);
//          contacto.getFieldValues().get(43).setValue("Jose");
//          c.put("/data/contact/7", gson.toJson(contacto))
//            String json=c.get("/data/contacts?depth=complete&search='emailAddress=jshernandez@soaint.com'");
//            System.out.println(json);
//            ResponseContacts r=mapper.readValue(json, ResponseContacts.class);
//            for(int i=0;i<r.getElements().size();i++){
//                System.out.println(r.getElements().get(i).toString());
//            }
        ArrayList<Contact> contactosRN=new ArrayList<>();
        Contact contacto=new Contact();
        contacto.setCorreo("jshernandez@soaint.com");
        contacto.setFacebook("jose");
        contacto.setTwitter("J053");
        contactosRN.add(contacto);
        contacto=new Contact();
        contacto.setCorreo("usuarioNuevo@gmail.com");
        contacto.setFacebook("suFacebook");
        contacto.setTwitter("suTwitter");
        contactosRN.add(contacto);
        contacto=new Contact();
        contacto.setCorreo("vili.claudiu.mosneagu@soaint.com");
        contacto.setFacebook("Billy Mosneagu");
        contacto.setTwitter("billy_cl_mo");
        contactosRN.add(contacto);
        
        Control control=new Control();
        control.verifyData(contactosRN);
        //System.out.println(control.getContactByEmail("jshernandez@soaint.com").toString());
        
         
        
        
        
        
        
    }
    
}
