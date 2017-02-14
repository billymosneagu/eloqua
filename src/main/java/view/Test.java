/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import control.Client;
import control.ClientRN;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;
import model.ContactoRN;
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
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Client c=new Client("SOAINTREALIANCONSULT1\\Vili.Mosneagu", "Admin123Soaint", "https://secure.p06.eloqua.com/API/REST/2.0");
//      
//        ObjectMapper mapper=new ObjectMapper();
//        Gson gson= new Gson();
//
//        Contact contacto=new Contact();
//        contacto.setId(1); 
//        contacto.setEmailAddress("rtinbra@norway.com");
//        contacto.setAccountName("tinbras nuevo");
        
//        String json=gson.toJson(contacto);
        //System.out.println(c.put("/data/contact", json));
        //json=c.get("/data/contact/10");
        ClientRN rn=new ClientRN();
        System.out.println(rn.getInfo().size());
//        System.out.println();
//        try {
//            contacto=mapper.readValue(json, Contact.class);
//            System.out.println(contacto.toString());
//            //ClientRN crn=new ClientRN();
//            
//            // crn.getNombre(539);
//        } catch (IOException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
        
    }
    
}
