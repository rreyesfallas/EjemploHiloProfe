
package hilos;

/**
 *
 * @author fvp
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        ///
        Thread hilo2 = new Thread(new Proceso2()); // crear un Obj tipo Thread pero ejecute las instrucciones de Proceso2()
        
        
        hilo1.start(); //OUT Subproceso1
        hilo2.start();// OUT Subproceso2
        hilo3.start();// OUT Subporceso1
        
    }
    
}
