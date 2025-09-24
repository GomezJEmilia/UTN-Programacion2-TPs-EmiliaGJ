/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Usuario
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public PlacaMadre getPlacaMadre() { return placaMadre; }

    public Propietario getPropietario() { return propietario; }

    public void setPropietario(Propietario propietario) {
        if (this.propietario != propietario) {
            this.propietario = propietario;
            if (propietario != null && propietario.getComputadora() != this) {
                propietario.setComputadora(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + placaMadre +
                ", propietario=" + (propietario != null ? propietario.getNombre() : "null") +
                '}';
    }

}
