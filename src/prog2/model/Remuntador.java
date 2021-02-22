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
    
    private String nom, sector, estat;
    private int límitVent;
    private boolean sus_vis;
    
    public abstract String tipus();
    public void actualitzaEstat(Meteo meteo){
        
    }

}
