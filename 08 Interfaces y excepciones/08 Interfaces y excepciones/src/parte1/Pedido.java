package parte1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "CREADO";
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioEstado("El estado del pedido cambió a: " + nuevoEstado);
    }
    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + " - Estado: " + estado + " - Total: $" + calcularTotal();
    }
}
