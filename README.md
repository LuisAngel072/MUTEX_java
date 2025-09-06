# ACTIVIDAD 5 (LOCK) Granular

### Configuración del programa (Granular):
* Mantén la misma lista y el mismo lock.
* Modifica la función producir_tareas() para que añada las tareas de una en una. Para cada tarea, adquiere el lock, añade la tarea, y libera el lock inmediatamente.
* Modifica la función procesar_tareas() para que adquiera el lock solo para sacar una tarea.
* Mide el tiempo total de ejecución de este nuevo enfoque.

