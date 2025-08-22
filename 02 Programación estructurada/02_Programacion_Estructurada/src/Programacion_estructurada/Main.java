/**
 * PROGRAMACIÓN II - TUPaD
 * Trabajo Práctico N°2: Programación Estructurada
 * 
 * Estudiante: Emilia Gómez Juárez
*/

package Programacion_estructurada;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Ejercicio 1: Año bisiesto.
        /*int anio;
        System.out.println("Ingrese un año, por favor");
        anio = Integer.parseInt(input.nextLine());
        anio_bisiesto(anio);*/
        
        // Ejercicio 2: Número mayor
        /*int num1, num2, num3;
        System.out.println("Ingrese un número entero");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro número entero");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el último número entero");
        num3 = Integer.parseInt(input.nextLine());
        
        System.out.println("El número mayor es: " + mayor(num1, num2, num3));*/
        
        // Ejercicio 3: Clasificación de edad
        int edad;
        System.out.println("¿Cuántos años tenés?");
        edad = Integer.parseInt(input.nextLine());
        clasificacion_edad(edad);
        
        // Ejercicio 4: Descuento según categoría
       /* double precio;
        String categoria;
        
        System.out.println("Ingresa el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoría del producto (A, B o C):");
        categoria = input.nextLine();
        
        descuento_X_categoria(precio, categoria);*/
    }
    
    public static void anio_bisiesto(int anio){
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
                }
            
    }
    
    public static int mayor(int n1, int n2, int n3){
        int mayor = 0;
        
        if (n1 > mayor) {
            mayor = n1;
            if (n2 > mayor){
                mayor = n2;
                if (n3 > mayor){
                    mayor = n3;
                }
            }
        } 
        return mayor;
    }
    
    public static void clasificacion_edad(int edad){
        if (edad < 12){
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad < 18){
            System.out.println("Eres un Adolescente");
        } else if (edad > 17 && edad < 60) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 60){
            System.out.println("Eres un Adulto mayor");
        }
    }
    
    /*public static void descuento_X_categoria (double valor, String categoria){
        double valor_descuento;
        
        switch (categoria){
            case "A":
                valor_descuento = (valor * 10%);
        
        }
    }*/
}
