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

    private String _nom, _sector, _color, _estatNeu, _estatPista;
    private float _longitud;
    private LlistaRemuntadors _dependencies;

    /**
     * Constructor de la classe Pista
     *
     * @param nom
     * @param sector
     * @param color
     * @param longitud
     * @param estatNeu
     * @param estatPista
     */
    public Pista(String nom, String sector, String color, float longitud, String estatNeu,
            String estatPista) {
        _nom = nom;
        _sector = sector;
        _color = color;
        _estatNeu = estatNeu;
        _estatPista = estatPista;
        _longitud = longitud;
        _dependencies = new LlistaRemuntadors();
    }

    public void actualitzaEstat() {
        if (_dependencies.totsForaDeServei()) {
            setEstatPista("Tancada");
        }
    }

    /**
     * Getter de l'atribut nom.
     *
     * @return
     */
    public String getNom() {
        return _nom;
    }

    public void setNom(String nom) {
        _nom = nom;
    }

    /**
     * Getter de l'atribut sector.
     *
     * @return
     */
    public String getSector() {
        return _sector;
    }

    public void setSector(String sector) {
        _sector = sector;
    }

    /**
     * Getter de l'atribut Color.
     *
     * @return
     */
    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    /**
     * Getter de l'atribut longitud.
     *
     * @return
     */
    public float getLongitud() {
        return _longitud;
    }

    public void setLongitud(float longitud) {
        _longitud = longitud;
    }

    /**
     * Getter de l'atribut estat_neu.
     *
     * @return
     */
    public String getEstatNeu() {
        return _estatNeu;
    }

    public void setEstatNeu(String estatNeu) {
        if (estatNeu.equals("Dura") || estatNeu.equals("Primavera")
                || estatNeu.equals("Pols")) {
            this._estatNeu = estatNeu;
        } else {
            System.out.println("Nou estat no vàlid");
        }
    }

    /**
     * Getter de l'atribut estat pista.
     *
     * @return
     */
    public String getEstatPista() {
        return _estatPista;
    }

    public void setEstatPista(String estat_pista) {
        _estatPista = estat_pista;
    }

    /**
     * Mètode que afegeix Remuntadors (dependéncies) a una pista.
     *
     * @param remuntador
     */
    public void afegirDependencia(Remuntador remuntador) {
        _dependencies.afegirRemuntador(remuntador);
    }

    /**
     * Getter de l'atribut dependencies.
     *
     * @return
     */
    public LlistaRemuntadors getDependencies() {
        return _dependencies;
    }

    /**
     * Metode toString de la clase Pista que retorna un string amb la informació
     * de la pista.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pista: " + _nom + ", Sector: " + _sector + ", Color: " + _color
                + ", Estat Neu: " + _estatNeu + ", Estat Pista: " + _estatPista
                + ", Longitud: " + _longitud + " Km , Dependencies: "
                + _dependencies.getNoms() + "\n";
    }

}
