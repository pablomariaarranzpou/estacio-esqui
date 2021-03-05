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
    private float longitud;
    private LlistaRemuntadors dependencies;
    
    /**
     * Constructor de la classe Pista
     * @param nom
     * @param sector
     * @param color
     * @param longitud
     * @param estat_neu
     * @param estat_pista 
     */
    public Pista(String nom, String sector, String color, float longitud, String estat_neu,
            String estat_pista) {
        this.nom = nom;
        this.sector = sector;
        this.color = color;
        this.estat_neu = estat_neu;
        this.estat_pista = estat_pista;
        this.longitud = longitud;
        this.dependencies = new LlistaRemuntadors();
    }

    public void actualitzaEstat() {

    }
    
    /**
     * Mètode que afegeix Remuntadors (dependéncies) a una pista.
     * @param rm 
     */
    public void afegirDependencia(Remuntador rm) {
        this.dependencies.afegirRemuntador(rm);
    }
    
    /**
     * Getter de l'atribut nom.
     * @return 
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Getter de l'atribut sector.
     * @return 
     */
    public String getSector() {
        return sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }
    
    /**
     * Getter de l'atribut Color.
     * @return 
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Getter de l'atribut longitud.
     * @return 
     */
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
    /**
     * Getter de l'atribut estat_neu.
     * @return 
     */
    public String getEstat_neu() {
        return estat_neu;
    }

    public void setEstat_neu(String estat_neu) {
        if (estat_neu.equals("Dura") || estat_neu.equals("Primavera")
                || estat_neu.equals("Pols")) {
            this.estat_neu = estat_neu;
        } else {
            System.out.println("Nou estat no vàlid");
        }
    }
    
    /**
     * Getter de l'atribut estat pista.
     * @return 
     */
    public String getEstat_pista() {
        return estat_pista;
    }

    public void setEstat_pista(String estat_pista) {
        this.estat_pista = estat_pista;
    }
    
    /**
     * Getter de l'atribut dependencies.
     * @return 
     */
    public LlistaRemuntadors getDependencies() {
        return dependencies;
    }

    /**
     * Metode toString de la clase Pista que retorna un string amb la informació
     * de la pista.
     * @return 
     */
    @Override
    public String toString() {
        return "Pista: " + nom + ", Sector: " + sector + ", Color: " + color
                + ", Estat Neu: " + estat_neu + ", Estat Pista: " + estat_pista
                + ", Longitud: " + longitud + " Km , Dependencies: "
                + dependencies.getNoms() + "\n";
    }
    
}
