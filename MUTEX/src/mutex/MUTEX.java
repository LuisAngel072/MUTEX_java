package mutex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Versión granular de bloqueo
 * @author Luis Angel
 */
public class MUTEX {
    
    static List<Integer> listaDeTareas = new ArrayList<>();
    static Lock lock = new ReentrantLock(false);
    static long t0 = System.nanoTime(); 
 
    public static void main(String[] args) throws InterruptedException {
       
       int j = 1;
       while(listaDeTareas.size() < 1000) {
         j++;
         Thread hiloProd = new Thread(new Productor(j));
         hiloProd.start();
         hiloProd.join();
       }
       

       //Crea y ejecuta los hilos hasta que se terminen las tareas
       while (!listaDeTareas.isEmpty()) {
        for (int i = 0; i < 5; i++) {
                Thread hilo = new Thread(new Consumidor(i + 1));
                hilo.start();
            }
        }

        long t2 = System.nanoTime();
        System.out.println("\nTiempo de realización de todas las tareas: " + ((t2 - t0) / 1_000_000));
        
    }
}