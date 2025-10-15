/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal {
    private String nombre;
    private String color;
    private String raza;
    public Perro(String nombre, String color, String raza,String tipo) {
        super(tipo);
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice Guau guau");
    }
}
