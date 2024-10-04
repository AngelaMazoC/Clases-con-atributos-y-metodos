package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    // Atributo para almacenar libros
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Lista de Libros en la Biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println();
        }
    }

    
}


