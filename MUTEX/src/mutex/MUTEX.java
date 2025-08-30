package mutex;

public class MUTEX {

    public static void main(String[] args) {
        int numHilos = 5;
        int iteraciones = 100_000;
        
        // Código ...
        
        //Crear los 5 hilos
        Thread[] hilosSuma = new Thread[numHilos];
        
        //Declara los 5 hilos como parte de la clase hilosSuma
        for (int i = 0; i < numHilos; i++) {
            hilosSuma[i] = new Thread(new hiloSuma(iteraciones));
        }
        
        //Inicializa los hilos
        for (int i = 0; i < numHilos; i++) {
            hilosSuma[i].start();
        }
        
        // Esperar a que todos terminen
        for (int i = 0; i < numHilos; i++) {
            try {
                hilosSuma[i].join(); //Espera que el hilo termine
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        //Al no tener MUTEX aplicado (aún), el valor esperado "500_000"
        //no aparecerá
        System.out.println("Valor final del contador: " + hiloSuma.contador);
    }
}
