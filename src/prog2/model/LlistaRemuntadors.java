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
public class LlistaRemuntadors {
    
    ArrayList <Remuntador> llistaRemuntadors;

    public LlistaRemuntadors() {
        this.llistaRemuntadors = new ArrayList();
    }
    
    public void actualitzaEstat(Meteo meteo){
        
    }
public void afegirRemuntador (Remuntador rm){
    llistaRemuntadors.add(rm);
}
public boolean totsForaDeServei(){
    
    for (int i = 0; i < llistaRemuntadors.size(); i++) {
        if(llistaRemuntadors.get(i).getEstat().equals("obert"))
        return false;
    }
    
    return true;
    
}
public String llistarRemuntadors(String estat){
    
    String string = "";
    for (int i = 0; i < llistaRemuntadors.size(); i++) {
        if(llistaRemuntadors.get(i).getEstat().equals(estat))
        string += llistaRemuntadors.get(i).toString();
    }
    
    return string;
    
}
public String getNoms(){
    String string = "";
    for (int i = 0; i < llistaRemuntadors.size(); i++) {
        string += llistaRemuntadors.get(i).getNom();
    }
    
    return string;
    
    
}

    
    
}
