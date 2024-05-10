package net.salesianos.duolingo.diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    private Map<String, Set<String>> palabrasPorInicial;

    public Diccionario() {
        this.palabrasPorInicial = new HashMap<>();
    }

    public void agregarPalabra(String palabra) {
        palabra = palabra.trim().toLowerCase();
        String inicial = String.valueOf(palabra.charAt(0));
        if (!palabrasPorInicial.containsKey(inicial)) {
            palabrasPorInicial.put(inicial, new HashSet<>());
        }
        palabrasPorInicial.get(inicial).add(palabra);
    }

    @Override
    public String toString() {
        String mensaje = "AlmacenPalabras: palabrasPorInicial=" + palabrasPorInicial + ": ";
        palabrasPorInicial.forEach((k, v) -> System.out.println("inicial: " + k + ": Value " + v));
        return mensaje;
    }

    public void eliminarPalabra(String palabra) {
        palabra = palabra.trim().toLowerCase();
        String inicial = String.valueOf(palabra.charAt(0));
        if (palabrasPorInicial.containsKey(inicial)) {
            palabrasPorInicial.get(inicial).remove(palabra);
            System.out.println("La palabra se ha eliminado correctamente.");
        } else {
            System.out.println("La palabra no estaba almacenada.");
        }
    }

    public void buscarPalabra(String palabra) {
        palabra = palabra.trim().toLowerCase();
        String inicial = String.valueOf(palabra.charAt(0));
        if (palabrasPorInicial.containsKey(inicial) && palabrasPorInicial.get(inicial).contains(palabra)) {
            System.out.println("La palabra se ha encontrado.");
        } else {
            System.out.println("La palabra no se ha encontrado.");
        }
    }

    public void mostrarInicialesDisponibles() {
        System.out.println("Iniciales disponibles: " + palabrasPorInicial.keySet());
    }

    public void mostrarPalabrasPorInicial(String inicial) {
        if (palabrasPorInicial.containsKey(inicial)) {
            System.out.println("Palabras con inicial '" + inicial + "': " + palabrasPorInicial.get(inicial));
        } else {
            System.out.println("No hay palabras con esa inicial en el diccionario.");
        }
    }
}
    
  