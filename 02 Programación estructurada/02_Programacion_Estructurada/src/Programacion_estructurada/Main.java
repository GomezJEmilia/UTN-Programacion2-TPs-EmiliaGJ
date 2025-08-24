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

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        /*int edad;
        System.out.println("¿Cuántos años tenés?");
        edad = Integer.parseInt(input.nextLine());
        clasificacion_edad(edad);*/
// Ejercicio 4: Descuento según categoría
        /*double precio;
        String categoria;
        
        System.out.println("Ingresa el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoría del producto (A, B o C):");
        categoria = input.nextLine();
        
        descuento_X_categoria(precio, categoria);*/
        //Ejercicio 5: Suma números pares
        //suma_pares();
        
        // Ejercicio 6: Contador de positivos, negativos y 0
        //contador_enteros();
    
        // Ejercicio 7: Validación de nota
        //validacion_nota();
        
        // Ejercicio 8: Cálculo del precio final con impuesto y descuento
        /*System.out.println("Ingrese el precio base del producto:");
        double precio_producto = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        double porcentaje_impuesto = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 20 para 20%)");
        double porcentaje_descuento = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precio_producto, porcentaje_impuesto, porcentaje_descuento));
        */
        
        //Ejercicio 9: Composición de funciones (precio + costo de envio)
        double valor_producto, peso_paquete, costo_envio, precio_final;
        String zona_envio;
        
        System.out.println("Ingrese el precio del producto:");
        valor_producto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg:");
        peso_paquete = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional):");
        zona_envio = input.nextLine();
        
        costo_envio = calcular_envio(peso_paquete, zona_envio);
        precio_final = calcular_precio_con_envio(valor_producto, costo_envio);
        
        System.out.println("El costo del envio es: " + costo_envio);
        System.out.println("El total a pagar es: " + precio_final);
    }

    public static void anio_bisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }

    }

    public static int mayor(int n1, int n2, int n3) {
        int mayor = 0;

        if (n1 > mayor) {
            mayor = n1;
            if (n2 > mayor) {
                mayor = n2;
                if (n3 > mayor) {
                    mayor = n3;
                }
            }
        }
        return mayor;
    }

    public static void clasificacion_edad(int edad) {
        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un Adolescente");
        } else if (edad > 17 && edad < 60) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor");
        }
    }

    public static void descuento_X_categoria(double valor, String categoria) {
        System.out.println("El valor original del producto es valor: " + valor);
        System.out.println("La categoría del producto es: " + categoria);

        switch (categoria) {
            case "A":
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + (valor - (valor * 10 / 100)));
                break;

            case "B":
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + (valor - (valor * 15 / 100)));
                break;

            case "C":
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + (valor - (valor * 20 / 100)));
                break;
            default:
                System.out.println("La categoría ingresada no corresponde a ningún producto");
        }
    }

    public static void suma_pares() {
        int suma = 0;
        System.out.println("Ingrese un número entero distinto a 0");
        int numero = Integer.parseInt(input.nextLine());

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.println("Ingrese otro número entero, si desea terminar ingrese 0");
            numero = Integer.parseInt(input.nextLine());
        }

        System.out.println("La suma de los números pares es: " + suma);
    }

    public static void contador_enteros() {
        int numero;
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            numero = Integer.parseInt(input.nextLine());
            if (numero == 0) {
                cero++;
            } else if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }

        }
        System.out.println("Resultados: \nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + cero);
    }

    public static void validacion_nota() {
        int nota;
        do {
            System.out.println("Ingrese una nota (0-10):");
            nota = Integer.parseInt(input.nextLine());

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }

        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente");
    }
    
    public static double calcularPrecioFinal(double precio_base, double impuesto, double descuento) {
        double precio_final = precio_base + (precio_base * impuesto/100) - (precio_base * descuento/100);
        return precio_final;
        
        
    }
    
    public static double calcular_envio (double peso, String zona){
        double costo_envio = 0;
        
        if (zona.equals("Nacional")){
           costo_envio = peso * 5;
        } else if (zona.equals("Internacional")){
            costo_envio = peso * 10;
        }
        
        return costo_envio;
    }
    
    
    public static double calcular_precio_con_envio(double precio_base, double costo_envio){
        return  precio_base + costo_envio;
    }

}
