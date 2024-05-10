Creamos el Map que va a funcionar como diccionario de tipo string con una estructura de sets del mismo tipo llamado: palabrasPorInicial. Creamos el diccionario con el hashMap.

![alt.text](/docs/images/diccionario1.png)

En el metodo agregarPalabra ponemos el .trim y el .lowercase para evitar errores por espacios y mayusculas, luego creamos un string de inicial para sacar al cual le decimos que su valor será la posicion 0 de la palabra escaneada por lo tanto la inicial de esta y le ponemos una condición que si el map no contiene la inicial de la palabra registrada cree un nuevo set por esa inicial y por ultimo agarra el set de la inicial y le añade la palabra.

![alt.text](/docs/images/diccionario2.png)

El metodo eliminarPalabra ponemos el .trim y el .lowercase para evitar errores por espacios y mayusculas, luego creamos un string de inicial para sacar al cual le decimos que su valor será la posicion 0 de la palabra escaneada por lo tanto la inicial de esta.
Luego tenemos un if que con la condicion de que si en el map esta esa inicial llamará a esa inicial y eliminara la palabra introducida mostrando un mensaje de eliminación y hay un else que en el caso de que no este la palabra mostrara su respectivo mensaje.

![alt.text](/docs/images/diccionario3.png)

El metodo buscarPalabra ponemos el .trim y el .lowercase para evitar errores por espacios y mayusculas, luego creamos un string de inicial para sacar al cual le decimos que su valor será la posicion 0 de la palabra escaneada por lo tanto la inicial de esta.
Luego tenemos un if que con la condicion de que si en el map esta esa inicial o bien si dentro del set de la inicial se encuentra la palabra se mostrara un mensaje de que se ha encontreado la palabra y un else por si no se ha encontrado

![alt.text](/docs/images/diccionario4.png)

En el metodo mostrarInicialesDisponibles habrá un sout en el que se mostraran las inicales registradas llamando al keyset del map es decir a todas las inicales registradas en el map

![alt.text](/docs/images/diccionario5.png)

En el metodo mostrarPalabrasPorInicial tenemos un if de que si la inical esta recogida en el map se mostraran todas las palabras con el set de la inicial seleccionada, en el caso de que no esté en el diccionario se mostrara un mensaje con esta información.

![alt.text](/docs/images/diccionario6.png)
