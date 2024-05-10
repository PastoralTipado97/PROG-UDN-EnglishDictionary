import java.util.Scanner;

import net.salesianos.duolingo.diccionario.Diccionario;
import net.salesianos.duolingo.menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Diccionario diccionario = new Diccionario();
        String opcion = " ";
        boolean seguirPreguntando = true;

        while (seguirPreguntando) {
            Menu.mostrarMenu();

            opcion = scanner.next();

            switch (opcion) {
                case "a":
                    System.out.print("Ingrese la palabra a agregar: ");
                    String palabraNueva = scanner.next();
                    diccionario.agregarPalabra(palabraNueva);
                    System.out.println("La palabra se ha guardado correctamente.");
                    break;
                case "b":
                    System.out.print("Ingrese la palabra a eliminar: ");
                    String palabraEliminada = scanner.next();
                    diccionario.eliminarPalabra(palabraEliminada);
                    break;
                case "c":
                    System.out.print("Ingrese la palabra a buscar: ");
                    String palabraSolicitada = scanner.next();
                    diccionario.buscarPalabra(palabraSolicitada);
                    break;
                case "d":
                    diccionario.mostrarInicialesDisponibles();
                    break;
                case "e":
                    System.out.print("Ingrese la inicial para mostrar las palabras: ");
                    String inicial = scanner.next().toLowerCase();
                    diccionario.mostrarPalabrasPorInicial(inicial);
                    break;
                case "s":
                    seguirPreguntando = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR. Por favor, ingrese una opción válida.");
            }
        }
        scanner.close();
    }
}
