package parte1;

public class PagoPayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado por $" + monto);
    }
}

