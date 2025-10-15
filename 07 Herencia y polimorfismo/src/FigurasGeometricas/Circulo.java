/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    } 
    
    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2); 
    }
}
