/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Universidad uni = new Universidad("Universidad Nacional");

// 1. Crear al menos 3 profesores y 5 cursos precargados
        Profesor pr1 = new Profesor("P001", "Ana López", "Matemáticas");
        Profesor pr2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor pr3 = new Profesor("P003", "Lucía Gómez", "Física");

        Curso c1 = new Curso("C101", "Álgebra I");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Física I");
        Curso c4 = new Curso("C104", "Estructuras de Datos");
        Curso c5 = new Curso("C105", "Cálculo Diferencial");

        uni.agregarProfesor(pr1);
        uni.agregarProfesor(pr2);
        uni.agregarProfesor(pr3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        boolean salir = false;

        do {
            System.out.println("\n===== MENÚ UNIVERSIDAD =====");
            System.out.println("1. Agregar profesor");
            System.out.println("2. Agregar curso");
            System.out.println("3. Asignar profesor a curso");
            System.out.println("4. Listar profesores");
            System.out.println("5. Listar cursos");
            System.out.println("6. Buscar profesor por ID");
            System.out.println("7. Buscar curso por código");
            System.out.println("8. Eliminar curso");
            System.out.println("9. Eliminar profesor");
            System.out.println("10. Mostrar cursos por profesor");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del profesor: ");
                    String idP = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Ingrese especialidad: ");
                    String esp = sc.nextLine();
                    uni.agregarProfesor(new Profesor(idP, nombreP, esp));
                    break;

                case 2:
                    System.out.print("Ingrese código del curso: ");
                    String cod = sc.nextLine();
                    System.out.print("Ingrese nombre del curso: ");
                    String nomC = sc.nextLine();
                    uni.agregarCurso(new Curso(cod, nomC));
                    break;

                case 3:

                    System.out.print("Ingrese código del curso: ");
                    String codCurso = sc.nextLine();
                    System.out.print("Ingrese ID del profesor: ");
                    String idProfesor = sc.nextLine();
                    uni.asignarProfesorACurso(codCurso, idProfesor);
                    break;

                case 4:
                    uni.listarProfesores();
                    break;

                case 5:
                    uni.listarCursos();
                    break;

                case 6:
                    System.out.print("Ingrese ID del profesor a buscar: ");
                    String busqP = sc.nextLine();
                    Profesor encontradoP = uni.buscarProfesorPorId(busqP);
                    if (encontradoP != null) {
                        encontradoP.mostrarInfo();
                    } else {
                        System.out.println("Profesor no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese código del curso a buscar: ");
                    String busqC = sc.nextLine();
                    Curso encontradoC = uni.buscarCursoPorCodigo(busqC);
                    if (encontradoC != null) {
                        encontradoC.mostrarInfo();
                    } else {
                        System.out.println("Curso no encontrado.");
                    }
                    break;

                case 8:
                    System.out.print("Ingrese código del curso a eliminar: ");
                    String elimC = sc.nextLine();
                    uni.eliminarCurso(elimC);
                    break;

                case 9:
                    System.out.print("Ingrese ID del profesor a eliminar: ");
                    String elimP = sc.nextLine();
                    uni.eliminarProfesor(elimP);
                    break;

                case 10:
                    uni.reporteCursosPorProfesor();
                case 11:
                    salir = true;
                    System.out.println("Saliendo... ¡hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (!salir);
    }
}
