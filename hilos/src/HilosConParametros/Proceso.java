
package HilosConParametros;

/**
 *
 * @author fvp
 */
public class Proceso extends Thread{
    
    int num_int; // propiedad de la clase
    
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }
    
    @Override
    public void run(){
        for(int i=0; i<=num_int; i++){
            System.out.println("el valor de i es "+i+ " el hilo "+ this.getName());
        }
        System.out.println(" ha finalizado  "+ this.getName());
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
        
    }
}
