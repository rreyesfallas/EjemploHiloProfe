
package hilos;

/**
 *
 * @author fvp
 */
public class Proceso2 implements Runnable {
    
    @Override// Sobreescriba todo lo quetiene Runnable por estas instrucciones
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("SubProceso 2");
        }
    }
}
