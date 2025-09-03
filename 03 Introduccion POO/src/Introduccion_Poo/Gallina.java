/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion_Poo;

/**
 *
 * @author Usuario
 */
public class Gallina {
  private int idGallina;
  private int edad;
  private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void envejecer(int cantAnios) {
        this.edad += cantAnios;
    }
    
    public void ponerHuevo(int cantHuevos) {
        this.huevosPuestos += cantHuevos;
    }
    
    public void mostrarEstado() {
        System.out.println("ID Gallina: " + this.idGallina + "\nEdad actual: " + this.edad + "\nHuevos puestos: " + this.huevosPuestos);
    
    }

    
}
