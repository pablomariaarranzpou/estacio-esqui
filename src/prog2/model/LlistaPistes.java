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
 *
 * Classe que guarda totes les Pistes en una ArrayList.
 */
public class LlistaPistes {

    private ArrayList<Pista> _llistaPistes;

    /**
     * Constructor per defecte de la clase LlistaPistes.
     */
    public LlistaPistes() {
        _llistaPistes = new ArrayList();
    }

    /**
     * Mètode amb el qual apliquem les conseqüències d´un canvi meteorològic a
     * totes les pistes de LlistaPistes.
     */
    public void actualitzaEstat() {
        for (int i = 0; i < _llistaPistes.size(); i++) {
            _llistaPistes.get(i).actualitzaEstat();
        }
    }

    /**
     * Mètode que retorna la mida de la llista.
     *
     * @return int
     */
    public int size() {
        return _llistaPistes.size();
    }

    /**
     * Mètode per afegir una pista a la llista de pistas.
     *
     * @param p
     */
    public void afegirPista(Pista p) {
        _llistaPistes.add(p);
    }

    /**
     * Mètode de cerca en la llista d´una pista amb el mateix nom donat per
     * paràmetre.
     *
     * @param nom
     * @return Pista
     */
    public Pista getPista(String nom) {
        for (int i = 0; i < _llistaPistes.size(); i++) {
            if (_llistaPistes.get(i).getNom().equals(nom)) {
                return _llistaPistes.get(i);
            }
        }
        return null;
    }

    /**
     * Mètode que ens llista totes les pistes amb un estat específic de
     * LlistaPistes.
     *
     * @param estat
     * @return String
     */
    public String llistarPistes(String estat) {
        String string = "";
        if (estat.equals("Tots")) {
            for (int i = 0; i < _llistaPistes.size(); i++) {
                string += _llistaPistes.get(i).toString();
            }
        } else {
            for (int i = 0; i < _llistaPistes.size(); i++) {
                if (_llistaPistes.get(i).getEstatPista().equals(estat)) {
                    string += _llistaPistes.get(i).toString();
                }
            }
        }
        return string;
    }

    /**
     * Mètode que ens calcula la suma de la longitud de totes les pistes de
     * l'estació d'esquí.
     *
     * @return float
     */
    public float calculaKmsPistesTotal() {
        float suma = 0;
        for (int i = 0; i < _llistaPistes.size(); i++) {
            suma += _llistaPistes.get(i).getLongitud();
        }
        return suma;
    }

    /**
     * Mètode que ens calcula la suma de la longitud de totes les pistes amb un
     * estat específic de LlistaPistes.
     *
     * @return float
     */
    public float calculaKmsPistesObertes() {
        float suma = 0;
        for (int i = 0; i < _llistaPistes.size(); i++) {
            if (_llistaPistes.get(i).getEstatPista().equals("Oberta")) {
                suma += _llistaPistes.get(i).getLongitud();
            }
        }
        return suma;
    }

    /**
     * Mètode que imprimeix tots els objectes de tipus Pista de LlistaPistes
     *
     * @return String
     */
    @Override
    public String toString() {
        String llista = "";
        for (int i = 0; i < _llistaPistes.size(); i++) {
            llista += _llistaPistes.get(i).toString();
        }
        return llista;
    }

}
