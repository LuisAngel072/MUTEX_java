package mutex;

/**
 *
 * @author Luis Angel de la Torre Gómez
 */
public class Productor implements Runnable {    
    public Productor() {}
    
    public Productor(int agr) {
        this.agregar = agr;
    }
    int agregar = 0;
   
    /**
     * Esto es para bloqueo grueso
     */
    public void agregarTarea() {
        if(MUTEX.listaDeTareas.isEmpty()) {
            for(int i = 0; i < 1000; i++) {
                MUTEX.listaDeTareas.addLast(i);
            }
        }
    }
    
    /**
     * Versión bloqueo granular
     * Bloquea y luego añade un elemento a la vez
     */
    @Override
    public void run() {
        try {
            MUTEX.lock.lock();
            MUTEX.listaDeTareas.addLast(this.agregar);
        } finally {
            System.out.println("Tiempo tomado para agregar una tarea: " + (((System.nanoTime() - MUTEX.t0) / 1_000_000 + "ms")));
            MUTEX.lock.unlock();
        }
    }
    
}