/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Introduccion_Poo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntroduccionPOO {
    static Scanner SCANNER = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ejercicio;
        do{
            System.out.println("Ingrese el ejercicio que desea comprobar (1 - 5). Si desea salir ingrese 0");
            ejercicio = Integer.parseInt(SCANNER.nextLine());
            
            switch (ejercicio){
                case 1: 
                    Estudiante estudiante = new Estudiante ("Pedro", "Argerich", "Matemática", 10);
                    estudiante.mostrarInfo();
                    estudiante.bajarCalificacion(3);
                    estudiante.mostrarInfo();
                    estudiante.subirCalificacion(2);
                    estudiante.mostrarInfo();
                    break;
                    
                case 2:
                    Mascota perro = new Mascota ("Inti", "Labrador", 9);
                    perro.mostrarInfo();
                    perro.cumplirAnos();
                    perro.mostrarInfo();
                    break;
                    
                case 3:
                    Libro mobyDick = new Libro ();
                    
                    mobyDick.setAutor("Herman Melville");
                    String autor = mobyDick.getAutor();
                    
                    mobyDick.setTitulo("Moby Dick");
                    String titulo = mobyDick.getTitulo();
                    
                    mobyDick.setAnioPublicacion(1851);
                    int anioPubli = mobyDick.getAnioPublicacion();
                    
                    System.out.println("El libro " + titulo + " escrito por " + autor + " fue publicado el año " + anioPubli);
                    
                    mobyDick.setAnioPublicacion(2030);
                    //anioPubli = mobyDick.getAnioPublicacion();
                    
                    System.out.println("El libro " + titulo + " escrito por " + autor + " fue publicado el año " + anioPubli);
                    
                    break;
                    
                case 4:
                    Gallina gallina1 = new Gallina (100, 5, 58);
                    Gallina gallina2 = new Gallina (1002, 3, 35);
                    
                    gallina1.ponerHuevo(10);
                    gallina1.envejecer(2);
                    
                    gallina2.envejecer(2);
                    gallina2.ponerHuevo(30);
                    
                    gallina1.mostrarEstado();
                    gallina2.mostrarEstado();
                    
                    break;
                case 5:
                    NaveEspacial nave1 = new NaveEspacial ("XL-15", 50);
                    nave1.despegar();
                    nave1.avanzar(1000);
                    nave1.recargarCombustible(1555);
                    nave1.avanzar(1000);
                    nave1.mostrarEstado();
                    
                    break;
                case 0:
                    System.out.println("Gracias por probar mi código. Saludos!");
                    break;
                default:
                    System.out.println("El número ingresado es incorrecto. Por favor, ingrese un número entero entre 1 y 5");            
                    break;
            }
        } while (ejercicio > 0 && ejercicio <=5);
          
    }
    
}
