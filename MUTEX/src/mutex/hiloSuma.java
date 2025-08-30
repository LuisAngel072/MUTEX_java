package mutex;

/**
 *
 * @author Luis Angel
 */
public class hiloSuma implements Runnable  {
    static int contador = 0; //Variable estatica, recurso compartido entre los hilos
    private int numIteraciones; //numero de iteraciones que se ingresa
    
    public hiloSuma(int iteraciones) {
        this.numIteraciones = iteraciones;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i <= numIteraciones; i++) {
                contador++; //Condicion de carrera, suma el contador
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    

}
