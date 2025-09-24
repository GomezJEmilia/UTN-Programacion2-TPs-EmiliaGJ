/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class MainEj1 {
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte (12345678, "04/09/2010", "foto_titular.jpg");
        
        Titular titular = new Titular ("Pedro Perez", "12345678");
        
        titular.setPasaporte(pasaporte);
        
        System.out.println(titular);
        
    }
}
