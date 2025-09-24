/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Usuario
 */
public class MainEj8 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana López", "ana@ejemplo.com");
        Documento doc1 = new Documento("Contrato de Alquiler", "Contenido legal del contrato...", "HASH12345", "24/09", usuario1);

        System.out.println(doc1);
    }
}
