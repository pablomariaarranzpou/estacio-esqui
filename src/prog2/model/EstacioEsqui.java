/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

/**
 *
 * @author arran
 */
public class EstacioEsqui {
    
    private String nomEstacio, visibilitat;
    private int vent;
    private Meteo meteo;
    private LlistaRemuntadors llistaRemuntadors;
    private LlistaPistes llistaPistes;

    public EstacioEsqui(String nomEstacio, int velocitatVent, String visibilitat) {       
        if(velocitatVent < 0 || !(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))){
            System.out.println("Dade no vàlides");
        }else{
        this.nomEstacio = nomEstacio;
        this.vent = velocitatVent;
        this.visibilitat = visibilitat;
        this.meteo = new Meteo(visibilitat, vent);
        this.llistaRemuntadors = new LlistaRemuntadors();
        this.llistaPistes = new LlistaPistes();
    }
    }

    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }

    public String getVisibilitat() {
        return visibilitat;
    }

    public void setVisibilitat(String visibilitat) {
        if(!(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))){
            System.out.println("Dade no vàlides");
        }else{
        this.visibilitat = visibilitat;
        }
    }

    public int getVent() {
        return vent;
    }

    public void setVent(int vent) {
        if(vent < 0){
            System.out.println("Dade no vàlides");
        }else{
        this.vent = vent;
        }
    }

    public Meteo getMeteo() {
        return meteo;
    }

    public void setMeteo(Meteo meteo) {
        this.meteo = meteo;
    }

    public LlistaRemuntadors getLlistaRemuntadors() {
        return llistaRemuntadors;
    }

    public void setLlistaRemuntadors(LlistaRemuntadors llistaRemuntadors) {
        this.llistaRemuntadors = llistaRemuntadors;
    }

    public LlistaPistes getLlistaPistes() {
        return llistaPistes;
    }

    public void setLlistaPistes(LlistaPistes llistaPistes) {
        this.llistaPistes = llistaPistes;
    }
    
    
    
}
