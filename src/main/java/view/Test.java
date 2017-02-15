/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import control.Client;
import control.ClientRN;
import control.PropertiesAcces;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
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
        
       Client c=new Client(PropertiesAcces.usereloqua(), PropertiesAcces.passloqua(), PropertiesAcces.urlloqua());
//      
//        ObjectMapper mapper=new ObjectMapper();
//        Gson gson= new Gson();

//String s="{"+'"'+"filter"+'"'+": "+'"'+"EXISTS('"+"{{ContactSegment[5]}}"+"')"+'"'+"}";

          System.out.println(c.execute("/assets/contact/segment/2", "GET", null));
        
        
        
        
    }
    
}
