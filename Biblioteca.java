package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Lista de Libros en la Biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println();
        }
    }

    
}


