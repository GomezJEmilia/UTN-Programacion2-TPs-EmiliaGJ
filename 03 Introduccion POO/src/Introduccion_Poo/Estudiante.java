/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion_Poo;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (apellido != null) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null) {
            this.curso = curso;
        }
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void subirCalificacion(double puntos) {
        if (calificacion <= 10 && (calificacion + puntos) <= 10) {
            calificacion = calificacion + puntos;
        } else {
            System.out.println("El estudiante ya tiene la nota máxima (10)");
        }
    }

    public void bajarCalificacion(double puntos) {
        if (calificacion >= 1 && (calificacion - puntos) >= 1) {
            calificacion = calificacion - puntos;
            
        } else {
            System.out.println("El estudiante ya tiene la calificación mínima (1)");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre :" + this.nombre + "\nApellido: " + this.apellido + "\nCurso: " + this.curso + "\nCalificación: " + this.calificacion);
    }

}
