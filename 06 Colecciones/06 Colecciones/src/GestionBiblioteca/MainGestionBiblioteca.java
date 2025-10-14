/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionBiblioteca;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MainGestionBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Ernest Hemingway", "Estadounidense");

        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENÚ BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Filtrar libros por año");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Mostrar cantidad total de libros");
            System.out.println("7. Mostrar autores disponibles");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Ingrese título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese año de publicación: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Seleccione autor (1: Márquez, 2: Rowling, 3: Hemingway): ");
                    int autorSel = sc.nextInt();
                    sc.nextLine();
                    Autor autor = switch (autorSel) {
                        case 1 ->
                            a1;
                        case 2 ->
                            a2;
                        case 3 ->
                            a3;
                        default ->
                            a1;
                    };
                    biblioteca.agregarLibro(isbn, titulo, anio, autor);
                    break;

                case 2:
                    biblioteca.listarLibros();
                    break;

                case 3:
                    System.out.print("Ingrese ISBN a buscar: ");
                    String buscar = sc.nextLine();
                    Libro encontrado = biblioteca.buscarLibroPorIsbn(buscar);
                    if (encontrado != null) {
                        encontrado.mostrarInfo();
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese año de publicación a filtrar: ");
                    int anioFiltro = sc.nextInt();
                    sc.nextLine();
                    List<Libro> filtrados = biblioteca.filtrarLibrosPorAnio(anioFiltro);
                    if (filtrados.isEmpty()) {
                        System.out.println("No hay libros de ese año.");
                    } else {
                        for (Libro l : filtrados) {
                            l.mostrarInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Ingrese ISBN del libro a eliminar: ");
                    String eliminar = sc.nextLine();
                    biblioteca.eliminarLibro(eliminar);
                    break;

                case 6:
                    System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());
                    break;

                case 7:
                    biblioteca.mostrarAutoresDisponibles();
                    break;

                case 8:
                    salir = true;
                    System.out.println("Saliendo del sistema... ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
