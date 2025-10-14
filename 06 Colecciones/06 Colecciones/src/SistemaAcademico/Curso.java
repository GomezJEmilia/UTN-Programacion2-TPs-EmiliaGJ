/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

/**
 *
 * @author Usuario
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }
        if (this.profesor != null) {
            Profesor previo = this.profesor;
            this.profesor = null;
            if (previo.getCursos().contains(this)) {
                previo.getCursos().remove(this);
            }
        }
        this.profesor = p;

        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "(sin asignar)"));
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (Profesor: " + (profesor != null ? profesor.getNombre() : "-") + ")";
    }
}
