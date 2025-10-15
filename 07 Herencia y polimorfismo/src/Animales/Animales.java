/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Animales {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", "Negro", "Labrador", "Perro"));
        animales.add(new Gato("Mishi", "Gris", "Gato"));
        animales.add(new Vaca("Lola", "Marrón", "Vaca"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
            System.out.println("-------------------------\n");
        }
    }
}
