/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;
/**
 *
 * @author Usuario
 */
public class MainEj10 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000.0, "ABC123");
        Titular titular = new Titular("María Gómez", "30111222");

        cuenta.setTitular(titular); 

        System.out.println(cuenta);
    }
}
