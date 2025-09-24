/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class MainEj3 {
     public static void main(String[] args) {
        Editorial editorial = new Editorial("Planeta", "Av. Corrientes 1234");

        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");

        Libro libro = new Libro("Cien Años de Soledad", "978-84-376-0494-7");

        
        libro.setEditorial(editorial); 
        libro.setAutor(autor);         

        System.out.println(libro);
    }
}
