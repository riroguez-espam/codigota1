public class Nodo<T> {
    public T dato; // lo que guarda el nodo
    public Nodo<T> siguiente; // flecha hacia el próximo nodo

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null; // al crearse no apunta a nada
    }
}
