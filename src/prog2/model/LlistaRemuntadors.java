/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.util.ArrayList;

/**
 *
 * @author arran
 * Classe que guarda els Remuntadors en una ArrayList.
 */
public class LlistaRemuntadors {

    private ArrayList<Remuntador> _llistaRemuntadors;

    /**
     * Constructor per defecte de la Classe LListaRemuntadors.
     */
    public LlistaRemuntadors() {
        this._llistaRemuntadors = new ArrayList();
    }

    /**
     * Mètode amb el qual apliquem les conseqüències d´un canvi meteorològic a
     * tots els remuntadors.
     *
     * @param meteo
     */
    public void actualitzaEstat(Meteo meteo) {
        for (int i = 0; i < _llistaRemuntadors.size(); i++) {
            _llistaRemuntadors.get(i).actualitzaEstat(meteo);
        }
    }
    
    /**
     * Mètode per afegir un remuntador a LlistaRemuntadors.
     * @param rm 
     */
    public void afegirRemuntador(Remuntador rm) {
        _llistaRemuntadors.add(rm);
    }
    
    /**
     * Mètode que ens indica si tots els 
     * remuntadors de la llista estan Fora de Servei o no.
     * @return boolean
     */
    public boolean totsForaDeServei() {
        for (int i = 0; i < _llistaRemuntadors.size(); i++) {
            if (_llistaRemuntadors.get(i).getEstat().equals("En Servei")) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Mètode que ens llista tots els remuntadors amb un estat específic
     * de LlistaRemuntadors.
     * @param estat
     * @return String
     */
    public String llistarRemuntadors(String estat) {
        String string = "";
        if (estat.equals("Tots")) {
            for (int i = 0; i < _llistaRemuntadors.size(); i++) {
                string += _llistaRemuntadors.get(i).toString();
            }
        } else {
            for (int i = 0; i < _llistaRemuntadors.size(); i++) {
                if (_llistaRemuntadors.get(i).getEstat().equals(estat)) {
                    string += _llistaRemuntadors.get(i).toString();
                }
            }
        }
        return string;
    }
    
    /**
     * Mètode que retorna tots els noms dels remuntadors de LlistaRemuntadors.
     * @return String
     */
    public String getNoms() {
        String string = "";
        for (int i = 0; i < _llistaRemuntadors.size(); i++) {
            string += _llistaRemuntadors.get(i).getNom() + " ";
        }

        return string;
    }
    
}
