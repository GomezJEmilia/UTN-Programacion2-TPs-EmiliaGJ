/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Usuario
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) {
        if (this.vehiculo != vehiculo ){
            this.vehiculo = vehiculo;
            if (vehiculo != null && this.vehiculo.getConductor() != this)
                vehiculo.setConductor(this);
            }
        this.vehiculo = vehiculo; }

    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia +
               "', vehiculo=" + (vehiculo != null ? vehiculo.getPatente() : "null") + "}";
    }
}