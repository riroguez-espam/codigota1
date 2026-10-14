public class Main {

    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();

        // Aqui ubicar las pruebas de los métodos de la lista
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        System.out.print("Contenido de la lista: ");
        lista.mostrarLista();
        System.out.println("Total de nodos: " + lista.contarNodos());
        System.out.println("¿Existe el 30?: " + lista.buscar(30));
        System.out.println("¿Existe el 99?: " + lista.buscar(99));
    }
}
