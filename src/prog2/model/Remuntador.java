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

    private String _nom, _sector, _estat;
    private int _limitVent;
    private boolean _susceptible;

    public Remuntador(String nom, String sector, String estat, int límitVent, boolean susceptible) {
        _nom = nom;
        _sector = sector;
        _estat = estat;
        _limitVent = límitVent;
        _susceptible = susceptible;
    }

    public abstract String tipus();

    public void actualitzaEstat(Meteo meteo) {
        if (getLímitVent() < meteo.getVent()
                || (isSusceptible() && meteo.getVisibilitat().equals("Dolenta"))) {
            setEstat("Fora de Servei");
        } else {
            setEstat("En servei");
        }
    }

    public String getNom() {
        return _nom;
    }

    public void setNom(String nom) {
        _nom = nom;
    }

    public String getSector() {
        return _sector;
    }

    public void setSector(String sector) {
        _sector = sector;
    }

    public String getEstat() {
        return _estat;
    }

    public void setEstat(String estat) {
        _estat = estat;
    }

    public int getLímitVent() {
        return _limitVent;
    }

    public void setLímitVent(int límitVent) {
        _limitVent = límitVent;
    }

    public boolean isSusceptible() {
        return _susceptible;
    }

    public void setSusceptible(boolean susceptible) {
        _susceptible = susceptible;
    }

    @Override
    public String toString() {
        return "Remuntador: " + _nom + ", Tipus: " + this.tipus() + ", Sector: " + _sector + ", Estat: " + _estat + "\n";
    }

}
