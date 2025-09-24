/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;  
    private Mesa mesa; 

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "Reserva{fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}
