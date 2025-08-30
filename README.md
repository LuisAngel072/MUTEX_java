# Act 4 Introducción al MUTEX

### Configuración del programa:
* Crea una variable global o un objeto de memoria compartida (un simple contador, por ejemplo) con un valor inicial de 0.
* Define una función que incremente este contador un gran número de veces (por ejemplo, 100,000 veces).
### Crea la condición de carrera:
* Inicia múltiples hilos (por ejemplo, 5 hilos) que ejecuten la función que incrementa el contador.
* Haz que cada hilo sume al contador 100,000 veces. Si todo funcionara perfectamente, el valor final debería ser 500,000.
* Imprime el valor final del contador. Verás que casi nunca llega a 500,000 debido a la condición de carrera, donde múltiples hilos leen el mismo valor, lo incrementan y escriben un valor incorrecto.

