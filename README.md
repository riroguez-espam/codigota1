# codigota1

Práctica de Aprendizaje Autónomo N° 01 — **Estructuras de Datos y Algoritmos (CDS-0202)**
Escuela Superior Politécnica Agropecuaria de Manabí Manuel Félix López (ESPAM MFL)

- **Docente:** Ing. Luiggi Alexander Jalca Saltos
- **Estudiante:** Geovanny Francisco Ríos Rodríguez
- **Tema:** Verificación Experimental de Operaciones Básicas en Listas Enlazadas Simples

## Descripción

Implementación de una Lista Enlazada Simple genérica (`<T>`) en Java y verificación de sus
operaciones básicas desde la clase principal `Main.java`:

| Método | Descripción | Complejidad |
|---|---|---|
| `insertarAlInicio(T dato)` | Enlaza un nuevo nodo antes de la cabeza | O(1) |
| `insertarAlFinal(T dato)` | Recorre hasta el último nodo y enlaza el nuevo | O(n) |
| `mostrarLista()` | Recorre e imprime la lista hasta `null` | O(n) |
| `contarNodos()` | Devuelve la cantidad de nodos | O(n) |
| `buscar(T valor)` | Búsqueda lineal; devuelve `true` o `false` | O(n) |

## Estructura

```
codigota1/
├── src/
│   ├── Nodo.java
│   ├── ListaEnlazadaSimple.java
│   └── Main.java
└── README.md
```

## Compilación y ejecución

Desde la carpeta `codigota1`:

```
javac src/*.java
java -cp src Main
```

## Salida esperada

```
Contenido de la lista: [10] -> [20] -> [30] -> [40] -> null
Total de nodos: 4
¿Existe el 30?: true
¿Existe el 99?: false
```
