
package usohilos;

/**
 *
 * @author fvp
 */
public class MiHilo implements Runnable{
    String nombreHilo;
    MiHilo(String nombre){
        nombreHilo= nombre;
    }

    public void run(){
    System.out.println("Comenzando a ejecutar "+nombreHilo);
    try{
        for(int contar=0; contar<10; contar++){
        Thread.sleep(400);
        System.out.println("En  "+nombreHilo+ ", el recuento"+ contar);
    }
    }
    catch (InterruptedException exc){
        System.out.println(nombreHilo + "ha sido Interrumpido por "+ exc);
    }
    System.out.println("Finalizando el "+nombreHilo);
    }
}