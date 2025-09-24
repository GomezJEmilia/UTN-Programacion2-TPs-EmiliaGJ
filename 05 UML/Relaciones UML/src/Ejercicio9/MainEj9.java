/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Usuario
 */
public class MainEj9 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Juan Pérez", "OSDE");
        Profesional profesional1= new Profesional("Dra. García", "Cardiología");

        CitaMedica cita = new CitaMedica("29/09", "10:30");
        cita.setPaciente(paciente1);
        cita.setProfesional(profesional1);
        
        System.out.println(cita);
    }
}
