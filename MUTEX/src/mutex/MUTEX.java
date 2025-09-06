package mutex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Versión bloqueo grueso
 * @author Luis Angel
 */
public class MUTEX {
    
    static List<Integer> listaDeTareas = new ArrayList<>();
    static Lock lock = new ReentrantLock(false);
    static long t0 = System.nanoTime(); 
 
    public static void main(String[] args) throws InterruptedException {
       
       Thread hiloProd = new Thread(new Productor());
       hiloProd.start();
       hiloProd.join();
       
       
       long t1 = System.nanoTime();
       //Crea y ejecuta los hilos hasta que se terminen las tareas       
       Thread hilo = new Thread(new Consumidor(1));
       hilo.start();
       hilo.join()

        long t2 = System.nanoTime();
        System.out.println("\nTiempo de realización de todas las tareas: " + ((t2 - t1) / 1_000_000) + "ms");
        
    }
}