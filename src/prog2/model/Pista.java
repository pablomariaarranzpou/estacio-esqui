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
public class Pista {
    
    private String nom, sector, color, estat_neu, estat_pista;
    private float longuitud;
    public void actualitzaEstat(){
        
    }
public void afegirDependencia(Remuntador rm){
    
}


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(float longuitud) {
        this.longuitud = longuitud;
    }



    public String getEstat_neu() {
        return estat_neu;
    }

    public void setEstat_neu(String estat_neu) {
        this.estat_neu = estat_neu;
    }

    public String getEstat_pista() {
        return estat_pista;
    }

    public void setEstat_pista(String estat_pista) {
        this.estat_pista = estat_pista;
    }


}
