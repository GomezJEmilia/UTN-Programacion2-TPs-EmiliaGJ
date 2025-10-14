/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("Ya existe un profesor con ID: " + p.getId());
            return;
        }
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre());
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("Ya existe un curso con código: " + c.getCodigo());
            return;
        }
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getNombre());
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso == null) {
            System.out.println("No se encontró el curso con código: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("No se encontró el profesor con ID: " + idProfesor);
            return;
        }
        curso.setProfesor(profesor);
        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        System.out.println("Lista de profesores:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        System.out.println("Lista de cursos:");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) {
            System.out.println("No se encontró curso con código: " + codigo);
            return false;
        }

        if (c.getProfesor() != null) {
            Profesor prof = c.getProfesor();
            prof.getCursos().remove(c);
            c.setProfesor(null);
        }
        cursos.remove(c);
        System.out.println("Curso eliminado: " + codigo);
        return true;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) {
            System.out.println("No se encontró profesor con ID: " + id);
            return false;
        }
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        profesores.remove(p);
        System.out.println("Profesor eliminado: " + p.getNombre());
        return true;
    }

    public void reporteCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " curso(s)");
        }
    }

}
