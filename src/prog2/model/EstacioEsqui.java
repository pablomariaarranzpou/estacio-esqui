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
        
        this.nomEstacio = nomEstacio;
        this.vent = velocitatVent;
        this.visibilitat = visibilitat;
        this.meteo = new Meteo(visibilitat, vent);
        this.llistaRemuntadors = new LlistaRemuntadors();
        this.llistaPistes = new LlistaPistes();
    }
    
    
    
}
