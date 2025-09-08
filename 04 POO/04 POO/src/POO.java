/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan Molina", "Gerente", 3500000);
        Empleado empleado2 = new Empleado("Pablo Miralles", "Administrativo");
        Empleado empleado3 = new Empleado("Ramiro Juárez", "Cajero");
        Empleado empleado4 = new Empleado(4, "Sofia Perez", "Administrativa", 1500000);
        Empleado empleado5 = new Empleado("Aldana Fonda", "Cajera");
        
        System.out.println("Datos de empleados 2 y 5 antes de actualizar sueldos");
        mostrarEmpleado(empleado2);
        mostrarEmpleado(empleado5);
        
        empleado2.actualizarSalario(550000.00);
        empleado5.actualizarSalario(15);
        
        System.out.println("\nDatos de todos los empleados con sueldos actualizados");
        mostrarEmpleado(empleado1);
        mostrarEmpleado(empleado2);
        mostrarEmpleado(empleado3);
        mostrarEmpleado(empleado4);
        mostrarEmpleado(empleado5);
        
        System.out.println("\nEl total de empleados registrados es: " 
                + Empleado.mostrarTotalEmpleados()); 
    }
    public static void mostrarEmpleado(Empleado empleado){
        System.out.println(empleado.toString());
    }
}
