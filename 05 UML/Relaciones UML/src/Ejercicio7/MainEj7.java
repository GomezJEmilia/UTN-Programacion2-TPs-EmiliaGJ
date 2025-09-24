/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Usuario
 */
public class MainEj7 {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Nafta", "SN12345");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", motor1);
        Conductor conductor1 = new Conductor("Juan Pérez", "LIC98765");

        vehiculo1.setConductor(conductor1);

        System.out.println(vehiculo1);
    }
}
