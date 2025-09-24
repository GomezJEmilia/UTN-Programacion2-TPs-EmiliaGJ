/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;  
    private Banco banco;      

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) {
        if (this.cliente != cliente) {
            this.cliente = cliente;
            if (cliente != null && cliente.getTarjeta() != this) {
                cliente.setTarjeta(this); 
            }
        }
    }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", banco=" + (banco != null ? banco.getNombre() : "null") +
                '}';
    }
}
