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
 */
public class LlistaPistes {
    
    ArrayList <Pista> llistaPistes;
    int numPistes = 12;
    

    public LlistaPistes() {
        llistaPistes = new ArrayList(numPistes);
    }
    
    public void actualitzaEstat() {

    }

    public void afegirPista(Pista p) {
        
        if(llistaPistes.size() < numPistes){
            llistaPistes.add(llistaPistes.size(), p);
        }

    }

    public Pista getPista(String nom) {
        
        for (int i = 0; i < llistaPistes.size(); i++) {
            if (llistaPistes.get(i).getNom().equals(nom)) {
                return llistaPistes.get(i);
            }  
        }
        return null;
    }

    public String llistarPistes(String estat) {
        
        ArrayList <Pista> llistarPistes = new ArrayList(numPistes);
        
        for (int i = 0; i < llistaPistes.size(); i++) {
            if (llistaPistes.get(i).getEstat_pista().equals(estat) ) {
                llistarPistes.add(llistaPistes.get(i));
            }  
        }
        return llistarPistes.toString();

    }

    public float calculaKmsPistes(String estat) {
        
        ArrayList <Pista> llistarPistes = new ArrayList(numPistes);
        float suma = 0;
        
        for (int i = 0; i < llistaPistes.size(); i++) {
                suma += llistarPistes.get(i).getLonguitud(); 
        }
        return suma;

    }

    @Override
    public String toString() {

        String llista = "";
        for(int i = 0; i<llistaPistes.size(); i++){
            llista+=  llistaPistes.get(i).toString();
        }
        return llista;
    }  
    
    
    

    
    

}
