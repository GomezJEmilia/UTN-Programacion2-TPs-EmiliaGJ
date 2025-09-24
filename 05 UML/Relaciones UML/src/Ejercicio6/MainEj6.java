/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Usuario
 */
public class MainEj6 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Pérez", "2611234567");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("24/09", "21:00", mesa1);
        
        reserva1.setCliente(cliente1);
        
        System.out.println(reserva1);
    }
}
