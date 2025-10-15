/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Figuras {
    public static void main(String[] args) {
        ArrayList <Figura> figuras = new ArrayList <>();
        
        Figura c1 = new Circulo (3.5, "Circulo 1");
        Figura c2 = new Circulo (2, "Circulo 2");
        Figura c3 = new Circulo (5, "Circulo 3");
        
        Figura r1 = new Rectangulo (2, 5, "Rectangulo 1");
        Figura r2 = new Rectangulo (5, 3, "Rectangulo 2");
        Figura r3 = new Rectangulo (1.5, 4, "Rectangulo 3");
        
        figuras.add(r3);
        figuras.add(r2);
        figuras.add(r1);
        figuras.add(c3);
        figuras.add(c2);
        figuras.add(c1);
        
        for (Figura f : figuras){
            System.out.println("El area de " + f.getNombre() 
                    + " es: " + f.calcularArea());
        }
    }
}
