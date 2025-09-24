/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Usuario
 */
public class MainEj5 {
     public static void main(String[] args) {
        Propietario propietario = new Propietario("Ana Gómez", "30123456");

        Computadora compu = new Computadora("Dell", "SN12345", "Z490", "Intel");
        
        compu.setPropietario(propietario);
        
        System.out.println(compu);
        System.out.println(propietario);
    }
}
