/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Billy
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class C {
    private String existing_custom;
    private String free_upgrade;
    private String credit_card;
    private String security_code;
    private String accountnumber;
    private LinkedField accounttype;
    private Vip vip;
    private String clv;
    private LinkedField credit_card_type;
    private String age;
    private String siebel_contact_id;
    private String service_tag;
    private String org_name;
    private String csat_score;
    private String virtual_assistant;
    private String dni;
    private Date fecha_expedicion;
    private String pasaporte;
    private boolean autoriza_mailing;
    private LinkedField sexo;
    private LinkedField trato;
    private String promedio_duracion_estancia;
    private String forma_pago_habitual;
    private String numero_de_reservas;
    private String valor_fidelizacion;
    private String uso_completo;
    private String importe_promedio_noche;
    private String servicios_promedio;
    private String origen_reserva_habitual;
    private String twitter;
    private String facebook;
    private Tipocomentario tipocomentario;
    private boolean subscribirte;

    public C() {
    }

    public String getExisting_custom() {
        return existing_custom;
    }

    public void setExisting_custom(String existing_custom) {
        this.existing_custom = existing_custom;
    }

    public String getFree_upgrade() {
        return free_upgrade;
    }

    public void setFree_upgrade(String free_upgrade) {
        this.free_upgrade = free_upgrade;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public LinkedField getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(LinkedField accounttype) {
        this.accounttype = accounttype;
    }

    public Vip getVip() {
        return vip;
    }

    public void setVip(Vip vip) {
        this.vip = vip;
    }

    public String getClv() {
        return clv;
    }

    public void setClv(String clv) {
        this.clv = clv;
    }

    public LinkedField getCredit_card_type() {
        return credit_card_type;
    }

    public void setCredit_card_type(LinkedField credit_card_type) {
        this.credit_card_type = credit_card_type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSiebel_contact_id() {
        return siebel_contact_id;
    }

    public void setSiebel_contact_id(String siebel_contact_id) {
        this.siebel_contact_id = siebel_contact_id;
    }

    public String getService_tag() {
        return service_tag;
    }

    public void setService_tag(String service_tag) {
        this.service_tag = service_tag;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getCsat_score() {
        return csat_score;
    }

    public void setCsat_score(String csat_score) {
        this.csat_score = csat_score;
    }

    public String getVirtual_assistant() {
        return virtual_assistant;
    }

    public void setVirtual_assistant(String virtual_assistant) {
        this.virtual_assistant = virtual_assistant;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(Date fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public boolean isAutoriza_mailing() {
        return autoriza_mailing;
    }

    public void setAutoriza_mailing(boolean autoriza_mailing) {
        this.autoriza_mailing = autoriza_mailing;
    }

    public LinkedField getSexo() {
        return sexo;
    }

    public void setSexo(LinkedField sexo) {
        this.sexo = sexo;
    }

    public LinkedField getTrato() {
        return trato;
    }

    public void setTrato(LinkedField trato) {
        this.trato = trato;
    }

    public String getPromedio_duracion_estancia() {
        return promedio_duracion_estancia;
    }

    public void setPromedio_duracion_estancia(String promedio_duracion_estancia) {
        this.promedio_duracion_estancia = promedio_duracion_estancia;
    }

    public String getForma_pago_habitual() {
        return forma_pago_habitual;
    }

    public void setForma_pago_habitual(String forma_pago_habitual) {
        this.forma_pago_habitual = forma_pago_habitual;
    }

    public String getNumero_de_reservas() {
        return numero_de_reservas;
    }

    public void setNumero_de_reservas(String numero_de_reservas) {
        this.numero_de_reservas = numero_de_reservas;
    }

    public String getValor_fidelizacion() {
        return valor_fidelizacion;
    }

    public void setValor_fidelizacion(String valor_fidelizacion) {
        this.valor_fidelizacion = valor_fidelizacion;
    }

    public String getUso_completo() {
        return uso_completo;
    }

    public void setUso_completo(String uso_completo) {
        this.uso_completo = uso_completo;
    }

    public String getImporte_promedio_noche() {
        return importe_promedio_noche;
    }

    public void setImporte_promedio_noche(String importe_promedio_noche) {
        this.importe_promedio_noche = importe_promedio_noche;
    }

    public String getServicios_promedio() {
        return servicios_promedio;
    }

    public void setServicios_promedio(String servicios_promedio) {
        this.servicios_promedio = servicios_promedio;
    }

    public String getOrigen_reserva_habitual() {
        return origen_reserva_habitual;
    }

    public void setOrigen_reserva_habitual(String origen_reserva_habitual) {
        this.origen_reserva_habitual = origen_reserva_habitual;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Tipocomentario getTipocomentario() {
        return tipocomentario;
    }

    public void setTipocomentario(Tipocomentario tipocomentario) {
        this.tipocomentario = tipocomentario;
    }

    public boolean isSubscribirte() {
        return subscribirte;
    }

    public void setSubscribirte(boolean subscribirte) {
        this.subscribirte = subscribirte;
    }

    @Override
    public String toString() {
        return "C{" + "existing_custom=" + existing_custom + ", free_upgrade=" + free_upgrade + ", credit_card=" + credit_card + ", security_code=" + security_code + ", accountnumber=" + accountnumber + ", accounttype=" + accounttype + ", vip=" + vip + ", clv=" + clv + ", credit_card_type=" + credit_card_type + ", age=" + age + ", siebel_contact_id=" + siebel_contact_id + ", service_tag=" + service_tag + ", org_name=" + org_name + ", csat_score=" + csat_score + ", virtual_assistant=" + virtual_assistant + ", dni=" + dni + ", fecha_expedicion=" + fecha_expedicion + ", pasaporte=" + pasaporte + ", autoriza_mailing=" + autoriza_mailing + ", sexo=" + sexo + ", trato=" + trato + ", promedio_duracion_estancia=" + promedio_duracion_estancia + ", forma_pago_habitual=" + forma_pago_habitual + ", numero_de_reservas=" + numero_de_reservas + ", valor_fidelizacion=" + valor_fidelizacion + ", uso_completo=" + uso_completo + ", importe_promedio_noche=" + importe_promedio_noche + ", servicios_promedio=" + servicios_promedio + ", origen_reserva_habitual=" + origen_reserva_habitual + ", twitter=" + twitter + ", facebook=" + facebook + ", tipocomentario=" + tipocomentario + ", subscribirte=" + subscribirte + '}';
    }
    
    
    
}
