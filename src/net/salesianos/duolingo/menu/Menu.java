package net.salesianos.duolingo.menu;

public class Menu {
    public final static void mostrarMenu() {
        String menu = "\n--------------------------------------=== <Diccionario DUOLINGO> ===----------------------------------"
                +
                "\n* Pulsa: <a> para añadir una nueva palabra." +
                "\n* Pulsa: <b> para eliminar una palabra." +
                "\n* Pulsa: <c> para buscar una palabra." +
                "\n* Pulsa: <d> para mostrar las iniciales disponibles." +
                "\n* Pulsa: <e> para ver las palabras ordenadas por las iniciales." +
                "\n* Pulsa: <s> si deseas salir del programa."
                +
                "\n--------------------------------------=== <Diccionario DUOLINGO> ===----------------------------------";
        System.out.println(menu);
    }
}
