/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Billy
 */
public class PropertiesAcces {
    private static final Properties PROPERTIES = new Properties();
    
    public static String encloqua(){
        String key="";
        try {
            PROPERTIES.load(PropertiesAcces.class.getClassLoader().getResourceAsStream("properties.properties"));
            key=PROPERTIES.getProperty("elqenc");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return key;
    }
    public static String urlloqua(){
        String key="";
        try {
            PROPERTIES.load(PropertiesAcces.class.getClassLoader().getResourceAsStream("properties.properties"));
            key=PROPERTIES.getProperty("eloquaurl");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return key;
    }
    public static String rnuser(){
        String key="";
        try {
            PROPERTIES.load(PropertiesAcces.class.getClassLoader().getResourceAsStream("properties.properties"));
            key=PROPERTIES.getProperty("rnuser");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return key;
    }
    public static String rnpass(){
        String key="";
        try {
            PROPERTIES.load(PropertiesAcces.class.getClassLoader().getResourceAsStream("properties.properties"));
            key=PROPERTIES.getProperty("rnpass");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return key;
    }
    public static String rnenc(){
        String key="";
        try {
            PROPERTIES.load(PropertiesAcces.class.getClassLoader().getResourceAsStream("properties.properties"));
            key=PROPERTIES.getProperty("rnenc");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesAcces.class.getName()).log(Level.SEVERE, null, ex);
        }
       return key;
    }
}
