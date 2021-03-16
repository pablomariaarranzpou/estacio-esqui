/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.vista;

import java.util.Scanner;

/**
 *
 * @author ricardo.marques
 */
import prog2.model.EstacioEsqui;

public class VistaEstacioEsqui {

    /* Atributs */
    private EstacioEsqui _estacio;

    /* Constructor de la Vista */
    public VistaEstacioEsqui(String nomEstacio, int velocitatVent, String visibilitat) {
        // Creem un nou objecte Estació Esqui
        _estacio = new EstacioEsqui(nomEstacio, velocitatVent, visibilitat);
        _estacio.inicialitzaDadesVall2000();
    }

    /* Métodes */
    //WRITE YOUR CODE HERE
    public String llistarPistas(String estat) {
        return _estacio.getLlistaPistes().llistarPistes(estat);
    }

    public void actualitzarMeteo() {
        _estacio.getLlistaRemuntadors().actualitzaEstat(_estacio.getMeteo());
        _estacio.getLlistaPistes().actualitzaEstat();
    }

    public String llistarRemuntadors(String estat) {
        return _estacio.getLlistaRemuntadors().llistarRemuntadors(estat);
    }

    public void gestioEstacio() {
        // Creación de un objeto para leer el input desde el teclado
        Scanner sc = new Scanner(System.in);
        // Llamar a la funcion que gestiona el menu
        gestioMenu(sc);
    }

    /* ******************************************** */
 /* Gestion, Opciones y Descripcion del Menu (M) */
 /* ******************************************** */
    private static enum OpcionesMenu {
        M_Opcion_1_ListarPistas,
        M_Opcion_2_ListarPistasAbiertas,
        M_Opcion_3_ListarPistasCerradas,
        M_Opcion_4_ListarRemontadores,
        M_Opcion_5_ListarRemontadoresEnServicio,
        M_Opcion_6_ListarRemontadoresFueraServicio,
        M_Opcion_7_ModificarEstadoNieve,
        M_Opcion_8_CalcularTotalKms,
        M_Opcion_9_Modificar_Vent,
        M_Opcion_10_Modificar_Visibilitat,
        M_Opcion_11_Report_Meteo,
        M_Opcion_12_Salir
    };

    // Descripcion de las opciones del menu principal
    private static final String[] descMenu = {
        "Llistar la informació de totes les pistes", // Opcion 1
        "Llistar la informació de les pistes obertes", // Opcion 2
        "Llistar la informació de les pistes tancades", // Opcion 3
        "Llistar la informació de tots els remuntadors mecànics", // Opcion 4
        "Llistar la informació dels remuntadors en servei", // Opcion 5
        "Llistar la informació dels remuntadors fora de servei", // Opcion 6
        "Modificar l'estat de la neu d'una pista", // Opcion 7
        "Calcular i mostrar el total de kilometres de pistes i de pistes obertes", // Opcion 8
        "Modificar la velocitat del vent", // Opcion 9
        "Modificar la visibilitat", // Opcion 10
        "Mostrar les condicions meteorologiques actuals", // Opcion 11
        "Sortir del gestor de l'estació" // Opcion 12
    };

    // Funcion que gestiona el menu principal de la aplicacion
    // Tiene 3 pasos principales:
    //   1. Crear el objeto que representa (contiene) el menu
    //   2. Asignar las descripciones del menu
    //   3. Bucle donde se trata la opcion seleccionada por el usuario
    public void gestioMenu(Scanner sc) {
        // Creación del objeto que representa el menu. El primer argumento del contructor es el nombre del menu
        Menu<OpcionesMenu> menuEstacio = new Menu<>("Menu " + _estacio.getNomEstacio(), OpcionesMenu.values());
        //Menu<OpcionesMenu> menuEstacio = new Menu<>("Menu " + estacio.getNomEstacio(), OpcionesMenu.values());

        // Assignar una descripción a cada una de las opciones
        //  - OPCIONAL - Por defecto enseña el nombre de la opción
        menuEstacio.setDescripcions(descMenu);

        // Variable (de tipo enumerado igual a las opciones del menu) que contiene la opcion escogida
        OpcionesMenu opcionMenu;

        // Lanzar el bucle principal de la aplicación
        do {
            menuEstacio.mostrarMenu();
            opcionMenu = menuEstacio.getOpcio(sc);

            switch (opcionMenu) {
                case M_Opcion_1_ListarPistas:
                    System.out.println(llistarPistas("Tots"));
                    break;
                case M_Opcion_2_ListarPistasAbiertas:
                    System.out.println(llistarPistas("Oberta"));
                    break;
                case M_Opcion_3_ListarPistasCerradas:
                    System.out.println(llistarPistas("Tancada"));
                    break;
                case M_Opcion_4_ListarRemontadores:
                    System.out.println(llistarRemuntadors("Tots"));
                    break;
                case M_Opcion_5_ListarRemontadoresEnServicio:
                    System.out.println(llistarRemuntadors("En Servei"));
                    break;
                case M_Opcion_6_ListarRemontadoresFueraServicio:
                    System.out.println(llistarRemuntadors("Fora de Servei"));
                    break;
                case M_Opcion_7_ModificarEstadoNieve:
                    System.out.println("Quina pista desitja modificar?");
                    String nom = sc.next();
                    System.out.println("A quin estat la vol actualitzar?");
                    String actualitzar = sc.next();

                    if (_estacio.getLlistaPistes().getPista(nom) != null) {
                        _estacio.getLlistaPistes().getPista(nom).setEstatNeu(actualitzar);
                        System.out.println("Estat de la neu actualitzat.");
                    } else {
                        System.out.println("Pista " + nom + " no trobada en aquesta estació");
                    }
                    break;
                case M_Opcion_8_CalcularTotalKms:
                    System.out.println("Distància total: " + _estacio.getLlistaPistes().calculaKmsPistesTotal() + " kms");
                    System.out.println("Distància esquiable: " + _estacio.getLlistaPistes().calculaKmsPistesObertes() + " kms");
                    break;
                case M_Opcion_9_Modificar_Vent:
                    System.out.println("Seleccioni la velocitat del vent:");
                    if (_estacio.getMeteo().setVent(sc.nextInt())) {
                        System.out.println("Vent modificat correctament.");
                        actualitzarMeteo();
                    }
                    break;
                case M_Opcion_10_Modificar_Visibilitat:
                    if (_estacio.getMeteo().getVisibilitat().equals("Bona")) {
                        _estacio.getMeteo().setVisibilitat("Dolenta");
                        System.out.println("Visibilitat modificada correctament a Dolenta");
                    } else {
                        _estacio.getMeteo().setVisibilitat("Bona");
                        System.out.println("Visibilitat modificada correctament a Bona");
                    }
                    actualitzarMeteo();
                    break;
                case M_Opcion_11_Report_Meteo:
                    System.out.println(_estacio.getMeteo().toString());
                    break;
                default:
                    System.out.println("Aquesta no és una opció vàlida.");
            }

        } while (opcionMenu != OpcionesMenu.M_Opcion_12_Salir);
    }

}
