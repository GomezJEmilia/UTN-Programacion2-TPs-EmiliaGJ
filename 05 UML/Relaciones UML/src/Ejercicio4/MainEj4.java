/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class MainEj4 {
     public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");

        Cliente cliente = new Cliente("Juan Pérez", "12345678");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8901-2345-6789", "12/2027");

        
        tarjeta.setBanco(banco);   
        tarjeta.setCliente(cliente); 

        System.out.println(tarjeta);
    }
}
