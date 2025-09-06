package mutex;

/**
 *
 * @author Luis Angel de la Torre Gómez
 */
public class Consumidor implements Runnable {
    int tarea = 0;
    int noConsumidor = 1;
    int tiempoConcurrido = 0;
    
    public Consumidor(int nC) {
        this.noConsumidor = nC;
    }

    @Override
    public void run() {
       try {
           MUTEX.lock.lock();
            if (!MUTEX.listaDeTareas.isEmpty()) {
                // Obtener y eliminar la última tarea de forma segura
                int tarea = MUTEX.listaDeTareas.remove(MUTEX.listaDeTareas.size() - 1);
                System.out.println("Tarea no. " + tarea + " realizada por el hilo " + this.noConsumidor + '.');
            }

       } finally {
           MUTEX.lock.unlock();
       }
    }
    
}
