/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Usuario
 */
public class EmpleadoPlanta extends Empleado {

    private static double SUELDO_BASE = 1000000.0;
    private int antiguedad;
    private static double BONIFICACION_POR_ANIO = 100000.0;
    private double descuentos;

    public EmpleadoPlanta(int antiguedad, double descuentos, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.antiguedad = antiguedad;
        this.descuentos = descuentos;
    }

    public static double getSUELDO_BASE() {
        return SUELDO_BASE;
    }

    public static void setSUELDO_BASE(double SUELDO_BASE) {
        EmpleadoPlanta.SUELDO_BASE = SUELDO_BASE;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public static double getBONIFICACION_POR_ANIO() {
        return BONIFICACION_POR_ANIO;
    }

    public static void setBONIFICACION_POR_ANIO(double BONIFICACION_POR_ANIO) {
        EmpleadoPlanta.BONIFICACION_POR_ANIO = BONIFICACION_POR_ANIO;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    @Override
    protected void calcularSueldo() {
        this.sueldo = SUELDO_BASE + (antiguedad * BONIFICACION_POR_ANIO) - descuentos;
    }
}
