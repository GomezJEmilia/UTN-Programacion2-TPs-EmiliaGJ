/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class Cliente {
     private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        if (this.tarjeta != tarjeta) {
            this.tarjeta = tarjeta;
            if (tarjeta != null && tarjeta.getCliente() != this) {
                tarjeta.setCliente(this); 
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tarjetaNumero=" + (tarjeta != null ? tarjeta.getNumero() : "null") +
                '}';
    }
}
