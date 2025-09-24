/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Usuario
 */
public class MainEj13 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ana Pérez", "ana@ejemplo.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", u1);
    }
}
