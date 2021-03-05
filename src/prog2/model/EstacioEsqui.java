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
public class EstacioEsqui {

    private String nomEstacio, visibilitat;
    private int vent;
    private Meteo meteo;
    private LlistaRemuntadors llistaRemuntadors;
    private LlistaPistes llistaPistes;

    public EstacioEsqui(String nomEstacio, int velocitatVent, String visibilitat) {
        if (velocitatVent < 0 || !(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))) {
            System.out.println("Dade no vàlides, no s´ha pgout inicilitzar l´estació.");
        } else {
            this.nomEstacio = nomEstacio;
            this.vent = velocitatVent;
            this.visibilitat = visibilitat;
            this.meteo = new Meteo(visibilitat, vent);
            this.llistaRemuntadors = new LlistaRemuntadors();
            this.llistaPistes = new LlistaPistes();
        }
    }

    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }

    public String getVisibilitat() {
        return visibilitat;
    }

    public void setVisibilitat(String visibilitat) {
        if (!(visibilitat.equals("Bona") && !(visibilitat.equals("Dolenta")))) {
            System.out.println("Dade no vàlides");
        } else {
            this.visibilitat = visibilitat;
        }
    }

    public int getVent() {
        return vent;
    }

    public void setVent(int vent) {
        if (vent < 0) {
            System.out.println("Dades no vàlides");
        } else {
            this.vent = vent;
        }
    }

    public Meteo getMeteo() {
        return meteo;
    }

    public void setMeteo(Meteo meteo) {
        this.meteo = meteo;
    }

    public LlistaRemuntadors getLlistaRemuntadors() {
        return llistaRemuntadors;
    }

    public void setLlistaRemuntadors(LlistaRemuntadors llistaRemuntadors) {
        this.llistaRemuntadors = llistaRemuntadors;
    }

    public LlistaPistes getLlistaPistes() {
        return llistaPistes;
    }

    public void setLlistaPistes(LlistaPistes llistaPistes) {
        this.llistaPistes = llistaPistes;
    }

    public void inicialitzaDadesVall2000() {

        /* Remuntadors */
        Remuntador RM1 = new Telecadira("RM1", "Nord", "En Servei", 35, false);
        llistaRemuntadors.afegirRemuntador(RM1);
        Remuntador RM2 = new Teleesqui("RM2", "Nord", "En Servei", 35, false);
        llistaRemuntadors.afegirRemuntador(RM2);
        Remuntador RM3 = new Telecadira("RM3", "Nord", "En Servei", 35, false);
        llistaRemuntadors.afegirRemuntador(RM3);
        Remuntador RM4 = new Teleesqui("RM4", "Nord", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM4);
        Remuntador RM5 = new Telecabina("RM5", "Nord", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM5);
        Remuntador RM6 = new CintaTransportadora("RM6", "Nord", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM6);
        Remuntador RM7 = new Teleesqui("RM7", "Sud", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM7);
        Remuntador RM8 = new Telecadira("RM8", "Sud", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM8);
        Remuntador RM9 = new Telecabina("RM9", "Sud", "Fora de Servei", 60, true);
        llistaRemuntadors.afegirRemuntador(RM9);
        Remuntador RM10 = new Teleferic("RM10", "Inter-Sector", "En Servei", 60, false);
        llistaRemuntadors.afegirRemuntador(RM10);

        /* Pistes */
        Pista P1 = new Pista("P1", "Nord", "Negra", 0.8f, "Dura", "Oberta");
        llistaPistes.afegirPista(P1);
        Pista P2 = new Pista("P2", "Nord", "Vermella", 1.1f, "Dura", "Oberta");
        llistaPistes.afegirPista(P2);
        Pista P3 = new Pista("P3", "Nord", "Blava", 1.8f, "Pols", "Oberta");
        llistaPistes.afegirPista(P3);
        Pista P4 = new Pista("P4", "Nord", "Vermella", 1.2f, "Dura", "Oberta");
        llistaPistes.afegirPista(P4);
        Pista P5 = new Pista("P5", "Nord", "Blava", 2.1f, "Primavera", "Oberta");
        llistaPistes.afegirPista(P5);
        Pista P6 = new Pista("P6", "Nord", "Blava", 2.9f, "Pols", "Oberta");
        llistaPistes.afegirPista(P6);
        Pista P7 = new Pista("P7", "Nord", "Verda", 1.2f, "Primavera", "Oberta");
        llistaPistes.afegirPista(P7);
        Pista P8 = new Pista("P8", "Nord", "Verda", 0.9f, "Pols", "Oberta");
        llistaPistes.afegirPista(P8);
        Pista P9 = new Pista("P9", "Sud", "Vermella", 2.1f, "Dura", "Tancada");
        llistaPistes.afegirPista(P9);
        Pista P10 = new Pista("P10", "Sud", "Negra", 0.6f, "Primavera", "Tancada");
        llistaPistes.afegirPista(P10);
        Pista P11 = new Pista("P11", "Sud", "Vermella", 1.3f, "Primavera", "Oberta");
        llistaPistes.afegirPista(P11);
        Pista P12 = new Pista("P12", "Sud", "Blava", 1.9f, "Pols", "Oberta");
        llistaPistes.afegirPista(P12);

        /* Dependencies */
        P1.afegirDependencia(RM1);
        P2.afegirDependencia(RM2);
        P2.afegirDependencia(RM3);
        P3.afegirDependencia(RM5);
        P4.afegirDependencia(RM5);
        P5.afegirDependencia(RM5);
        P6.afegirDependencia(RM4);
        P7.afegirDependencia(RM5);
        P8.afegirDependencia(RM5);
        P8.afegirDependencia(RM6);
        P9.afegirDependencia(RM9);
        P10.afegirDependencia(RM9);
        P11.afegirDependencia(RM7);
        P11.afegirDependencia(RM9);
        P12.afegirDependencia(RM8);
    }

}
