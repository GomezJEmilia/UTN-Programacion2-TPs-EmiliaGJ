/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Usuario
 */
public class EmpleadoTemporal extends Empleado{

    private int diasTrabajados;
    public static final double PAGO_POR_DIA = 40000.0;

    public EmpleadoTemporal(int diasTrabajados, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    
    @Override
    protected void calcularSueldo() {
        this.sueldo = diasTrabajados * PAGO_POR_DIA;
    }  
}
