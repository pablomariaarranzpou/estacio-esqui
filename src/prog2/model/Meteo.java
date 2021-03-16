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
        if (vent < 0 || !(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))) {
            System.out.println("Dade no vàlides, no s´ha pgout inicilitzar l´estació.");
        } else {
            _visibilitat = visibilitat;
            _vent = vent;
        }
    }

    public String getVisibilitat() {
        return _visibilitat;
    }

    public void setVisibilitat(String visibilitat) {
        if (!(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))) {
            System.out.println("Dade no vàlides");
        } else {
            _visibilitat = visibilitat;
        }
    }

    public int getVent() {
        return _vent;
    }

    public void setVent(int vent) {
        if (vent < 0) {
            System.out.println("Dades no vàlides");
        } else {
            _vent = vent;
        }
    }

    @Override
    public String toString() {
        return "Meteo: " + "Visibilitat: " + _visibilitat + " Velocitat del vent: " + _vent + " km/h";
    }

}
