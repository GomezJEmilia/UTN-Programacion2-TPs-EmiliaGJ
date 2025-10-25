package parte1;

public class PagoTarjetaCredito implements PagoConDescuento {
    public static double DESCUENTO = 0.95;
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * DESCUENTO;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado por $" + monto);
    }
}

