/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion_java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio4_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int edad;
        System.out.println("Ingresa tu edad, por favor");
        edad = Integer.parseInt(input.nextLine());
        
        String nombre;
        System.out.println("Ingresa tu nombre, por favor");
        nombre = input.nextLine();
        
        System.out.println("Nombre ingresado: " + nombre + "\nEdad ingresada: " + edad);
    }
   
}
