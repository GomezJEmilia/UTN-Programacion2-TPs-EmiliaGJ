/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Usuario
 */
public class MainEj12 {
      public static void main(String[] args) {
        Contribuyente c1 = new Contribuyente("María López", "20-12345678-9");
        Impuesto imp1 = new Impuesto(15000.75, c1);

        Calculadora calc = new Calculadora();
        calc.calcular(imp1);
    }
}
