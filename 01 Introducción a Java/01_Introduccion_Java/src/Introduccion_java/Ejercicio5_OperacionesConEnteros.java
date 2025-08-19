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
public class Ejercicio5_OperacionesConEnteros {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int entero1, entero2;
        
        System.out.println("Ingresa el primer número entero:");
        entero1 = Integer.parseInt(input.nextLine());
        
        
        System.out.println("Ingresa el segundo número entero:");
        entero2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (entero1 + entero2));
        System.out.println("Resta: " + (entero1 - entero2));
        System.out.println("Multiplicación: " + (entero1 * entero2));
        System.out.println("División: " + (entero1 / entero2));
   }
}
