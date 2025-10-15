/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Empleados {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        
        Empleado e1 = new EmpleadoPlanta(5, 10000, "Mirtha", "González", "P001");
        Empleado e2 = new EmpleadoTemporal(15, "Carlos", "López", "T001");
        Empleado e3 = new EmpleadoPlanta(10, 12000, "Ana", "Ruiz", "P002" );
        Empleado e4 = new EmpleadoTemporal(8, "Luis", "Pérez", "T002");

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        for (Empleado e : empleados){
            e.calcularSueldo();
            e.mostrarInfo();
        }
    }
}
