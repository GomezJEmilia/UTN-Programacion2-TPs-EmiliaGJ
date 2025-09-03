/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion_Poo;

/**
 *
 * @author Usuario
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (this.combustible >= 300){
            System.out.println("En 3, 2, 1... Despegamos!!!");
        }
    
    }
    public void avanzar(int distancia){
        if (this.combustible >= distancia){
            System.out.println("Avanzamos " + distancia + " kilometros");
            this.combustible -= distancia;
            System.out.println("Te quedan " + this.combustible + " litros de combustible disponibles");
        } else {
            System.out.println("La nave necesita recarga de combustible para avanzar. \nEl minimo son 500 litros");
        }
    }
    
    public void recargarCombustible (int cantidad){
        if ((this.combustible + cantidad) <= 1500){
            this.combustible += cantidad;
        } else {
            int cantPosible = 1500 - this.combustible;
            System.out.println("Solo pudimos cargar " + cantPosible + " litros. Tanque lleno!");
            
            this.combustible += cantPosible;
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + this.nombre + "\nCombustible: " + this.combustible);
    }
}
