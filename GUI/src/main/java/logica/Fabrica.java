/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

/**
 *
 * @author francisco
 */
public class Fabrica {

    private static Fabrica instancia=null;
    private static Controller instanciaC=null;
    public Fabrica() {
    };

    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public IController getIController() {
        if (instanciaC == null) {
            instanciaC = new Controller();
        }
        return instanciaC;
    }
}


