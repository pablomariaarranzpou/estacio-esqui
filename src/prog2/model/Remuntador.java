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
public abstract class Remuntador {
    
    private String nom, sector, estat;
    private int límitVent;
    private boolean sus_vis;
    
    public abstract String tipus();
    //public void actualitzaEstat(Meteo meteo){ }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public int getLímitVent() {
        return límitVent;
    }

    public void setLímitVent(int límitVent) {
        this.límitVent = límitVent;
    }

    public boolean isSus_vis() {
        return sus_vis;
    }

    public void setSus_vis(boolean sus_vis) {
        this.sus_vis = sus_vis;
    }
    
}
