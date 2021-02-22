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
public class Teleesqui extends Remuntador{

    public Teleesqui(String nom, String sector, String estat, int límitVent, boolean susceptible) {
        super(nom, sector, estat, límitVent, susceptible);
    }

    @Override
    public String tipus() {
        return "Teleesqui";
    }
    
}
