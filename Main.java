package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        
        // Agregar libros a la biblioteca
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        
        // Mostrar libros en la biblioteca
        miBiblioteca.mostrarLibros();
    }
}

