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

    private String _visibilitat;
    private int _vent;

    public Meteo(String visibilitat, int vent) {
        if (vent >= 0 || visibilitat.equals("Bona") && visibilitat.equals("Dolenta")) {
            _visibilitat = visibilitat;
            _vent = vent;
        } else {
            System.out.println("Dades no vàlides, no s´ha pgout inicilitzar l´estació.");
        }
    }

    public String getVisibilitat() {
        return _visibilitat;
    }

    public void setVisibilitat(String visibilitat) {
        if (visibilitat.equals("Bona") || visibilitat.equals("Dolenta")) {
            _visibilitat = visibilitat;
        } else {
            System.out.println("Dada no vàlida.");
        }
    }

    public int getVent() {
        return _vent;
    }

    public boolean setVent(int vent) {
        if (vent < 0) {
            System.out.println("Dades no vàlides");
            return false;
        } else {
            _vent = vent;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Meteo: " + "\n\tVisibilitat: " + _visibilitat + "\n\tVelocitat del vent: " + _vent + " km/h";
    }

}
