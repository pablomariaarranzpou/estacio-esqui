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
    private LlistaRemuntadors dependencies;
    
    /**
     * Constructor de la clase Pista
     * @param nom
     * @param sector
     * @param color
     * @param longuitud
     * @param estat_neu
     * @param estat_pista 
     */
    public Pista(String nom, String sector, String color, float longuitud, String estat_neu,
            String estat_pista) {
        this.nom = nom;
        this.sector = sector;
        this.color = color;
        this.estat_neu = estat_neu;
        this.estat_pista = estat_pista;
        this.longuitud = longuitud;
        this.dependencies = new LlistaRemuntadors();
    }

    public void actualitzaEstat() {

    }
    
    /**
     * Métode que afegeix Remuntadors (dependéncies) a una pista.
     * @param rm 
     */
    public void afegirDependencia(Remuntador rm) {
        this.dependencies.afegirRemuntador(rm);
    }
    
    /**
     * Getter del atribut nom.
     * @return 
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Getter del atribut sector.
     * @return 
     */
    public String getSector() {
        return sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }
    
    /**
     * Getter del atribut Color.
     * @return 
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Getter del atribut longuitud.
     * @return 
     */
    public float getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(float longuitud) {
        this.longuitud = longuitud;
    }
    
    /**
     * Getter del atribut estat_neu.
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
     * Getter del atribut estat pista.
     * @return 
     */
    public String getEstat_pista() {
        return estat_pista;
    }

    public void setEstat_pista(String estat_pista) {
        this.estat_pista = estat_pista;
    }
    
    /**
     * Getter del atribut dependencies.
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
                + ", Longuitud: " + longuitud + " Km , Dependencies: "
                + dependencies.getNoms() + "\n";
    }
}
