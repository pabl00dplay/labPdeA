
package main.java.logica;
public class Fabrica {

    private static Fabrica instancia;
    private static IController ICtrl=null;
    
    private Fabrica() {
    };

    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public IController getIController() {
        if(ICtrl==null)
        {
            return Controller.getInstance();
        }
        return ICtrl;
}   
    
}
