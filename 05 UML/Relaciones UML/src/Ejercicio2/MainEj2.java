/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class MainEj2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria ("M6 Pro", "5000 mAh");
        
        Celular celular = new Celular("123456789", "Motorola", "MotoG22");
        celular.setBateria(bateria);
        
        Usuario usuario = new Usuario ("Emilia Gómez", "43153023");
        
        usuario.setCelular(celular);
        
        System.out.println(celular);
    }
}
