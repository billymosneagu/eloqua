/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;
import model.ContactEloqua;
import model.FieldValue;
import model.ResponseContacts;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Billy
 */
public class Control {

    private Client c;

    public Control() {
        c = new Client();
    }

    public ArrayList<ContactEloqua> getContactosEloqua() {
        String json = c.get("/data/contacts?depth=complete");
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<ContactEloqua> contactos=null;
        try {
            ResponseContacts r = mapper.readValue(json, ResponseContacts.class);
            contactos=r.getElements();
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contactos;
    }
    public String addContactEloqua(Contact contacto){
        ContactEloqua contacoElq=new ContactEloqua();
        contacoElq.setId(1);
        contacoElq.setEmailAddress(contacto.getCorreo());
        List<FieldValue> fvs=new ArrayList<FieldValue>();
        FieldValue fv=new FieldValue();
        fv.setType("FieldValue");
        fv.setId(100197);
        fv.setValue(contacto.getFacebook());
        fvs.add(fv);
        fv=new FieldValue();
        fv.setType("FieldValue");
        fv.setId(100198);
        fv.setValue(contacto.getTwitter());
        fvs.add(fv);
        contacoElq.setFieldValues(fvs);
        Gson gson=new Gson();
        String contacJson=gson.toJson(contacoElq);
        String response=c.post("/data/contact", contacJson);
        return response;
    }
    public String updateContact(ContactEloqua contacto){
        Gson gson=new Gson();
        String contacJson=gson.toJson(contacto);
        String response=c.put("/data/contact/"+contacto.getId(), contacJson);
        return response;
    }
    public ContactEloqua getContactByEmail(String email){
        ContactEloqua contacto=null;
        String responseString=c.get("/data/contacts?depth=complete&search='emailAddress="+email+"'");
        ObjectMapper mapper = new ObjectMapper();
        try {
            
            ResponseContacts response=mapper.readValue(responseString, ResponseContacts.class);
           
            if(response.getElements().size()!=0){
                contacto=response.getElements().get(0);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contacto;
    }
    public void verifyData(ArrayList<Contact> contactosRn){
        for(Contact contacto : contactosRn){
            ContactEloqua contactoElq=this.getContactByEmail(contacto.getCorreo());
            if(contactoElq==null){
                this.addContactEloqua(contacto);
            }else{
                for(int i=0;i<contactoElq.getFieldValues().size();i++){
                    int idFV=contactoElq.getFieldValues().get(i).getId();
                    if(idFV==100197){
                        contactoElq.getFieldValues().get(i).setValue(contacto.getFacebook());
                    }else{
                        if(idFV==100198){
                            contactoElq.getFieldValues().get(i).setValue(contacto.getTwitter());
                        }
                    }
                }
                this.updateContact(contactoElq);
            }
        }
    }

}
