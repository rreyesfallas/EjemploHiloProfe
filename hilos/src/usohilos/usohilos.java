
package usohilos;

/**
 *
 * @author fvp
 */
public class usohilos {
    public static void main(String[] args){
      System.out.println("Hilo principal esta por iniciar...");

      //Primero, construir un objeto MIHILO
      MiHilo mh=new MiHilo("No.1");
      
      //Luego se construye un hilo desde este objeto
      Thread nuevoh=new Thread(mh);
      
      //Finalmente, comienza la ejecucion del hilo
      System.out.println("Hilo principal esta iniciado!");
      nuevoh.start();
      
      
      for(int i=0; i<50; i++){
          System.out.println(" \\");
          System.out.println(" |");
          System.out.println(" /");
      }try{
          Thread.sleep(100);
      }catch (InterruptedException exc){
          System.out.println("Hilo pricipal interrupido.");
      }
      System.out.println("Hilo Principal finalizado :-(");
    }
}
