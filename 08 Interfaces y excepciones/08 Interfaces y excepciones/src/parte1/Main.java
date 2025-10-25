package parte1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 1500));
        pedido.agregarProducto(new Producto("Teclado", 2500));

        System.out.println(pedido);

        pedido.cambiarEstado("PAGADO");

        PagoConDescuento pagoTarjeta = new PagoTarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(pedido.calcularTotal());
        pagoTarjeta.procesarPago(totalConDescuento);
    }
}

