/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(int numero, String fechaEmision, String foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto (foto);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        if (this.titular != titular){
            this.titular = titular;
            if (titular != null && titular.getPasaporte() != this){
                titular.setPasaporte(this);
            }
        }
        
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + 
                ", fechaEmision=" + fechaEmision + 
                ", foto=" + foto + 
                ", titular=" + (titular != null ? titular.getDni() : "null") + '}';
    }
    
    
}
