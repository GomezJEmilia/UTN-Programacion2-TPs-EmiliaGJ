/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Usuario
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre() { return nombre; }
    
    public CuentaBancaria getCuenta() { return cuenta; }
    public void setCuenta(CuentaBancaria cuenta) {
        if (this.cuenta != cuenta) {
            this.cuenta = cuenta;
            if (cuenta != null && cuenta.getTitular() != this) {
                cuenta.setTitular(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    } 
}
