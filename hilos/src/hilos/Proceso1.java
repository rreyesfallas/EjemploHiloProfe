
package hilos;

/**
 *
 * @author fvp
 */
public class Proceso1 extends Thread {
    
    @Override
    public void run(){
        //instrucciones
        for(int i=0; i<=5; i++){
            System.out.println("SubProceso 1");
        }
    
    }
}
