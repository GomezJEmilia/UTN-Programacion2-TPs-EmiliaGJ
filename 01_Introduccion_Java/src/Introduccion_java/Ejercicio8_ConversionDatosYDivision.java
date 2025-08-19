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
public class Ejercicio8_ConversionDatosYDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int entero1, entero2;
        double division;
        
        System.out.println("Ingresa el primero entero");
        entero1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el segundo entero");
        entero2 = Integer.parseInt(input.nextLine());
        
        division = ((double) entero1 / entero2);
        System.out.println("El resultado de la division de ambos números es: " + division);
        
    }
}
