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
public class Meteo {
    
    private String visibilitat;
    private int vent;

    public Meteo(String visibilitat, int vent) {
        this.visibilitat = visibilitat;
        this.vent = vent;
    }

    public String getVisibilitat() {
        return visibilitat;
    }

    public void setVisibilitat(String visibilitat) {
        this.visibilitat = visibilitat;
    }

    public int getVent() {
        return vent;
    }
    
    public void setVent(int vent) {
        this.vent = vent;
    }

    @Override
    public String toString() {
        return "Meteo = " + "visibilitat=" + visibilitat + ", vent=" + vent + '}';
    }
    
    
    
    
    
}
