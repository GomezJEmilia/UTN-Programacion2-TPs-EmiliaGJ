/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }    
    
    public void setUsuario(Usuario usuario) {
        if (this.usuario != usuario){
            this.usuario = usuario;
            if (usuario != null && this.usuario.getCelular() != this)
                usuario.setCelular(this);
            }
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + 
                ", marca=" + marca + 
                ", modelo=" + modelo + 
                ", bateria=" + bateria + 
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") + '}';
    }
    
    
    
    
}
