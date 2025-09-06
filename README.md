# ACTIVIDAD 5 (LOCK) Grueso

### Configuración del programa (Bloqueo grueso):
* Crea una lista compartida (por ejemplo, lista_de_tareas) y un lock asociado.
* Define una función producir_tareas() que añada 1000 tareas a la lista. La función debe adquirir el lock antes de empezar a añadir todas las tareas, y liberarlo al terminar.
* Define una función procesar_tareas() que procese 1000 tareas. Cada vez que va a sacar una tarea de la lista, debe adquirir el mismo lock, sacar la tarea, y luego liberarlo.
* Mide el tiempo total que tarda en ejecutarse.

