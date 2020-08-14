
package HilosConParametros;

/**
 *
 * @author fvp
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso h1= new Proceso("Tarea--01");
        Proceso h2= new Proceso("Tarea--02");
        Proceso h3= new Proceso("Tarea--03");
        
        
        h1.ValorDeLaCondicion(5);
        h2.ValorDeLaCondicion(10);
        h3.ValorDeLaCondicion(15);
        
        h1.start();
        h2.start();
        h3.start();
    }
}
