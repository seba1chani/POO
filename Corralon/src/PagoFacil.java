public class PagoFacil implements FormaDePago {

    @Override
    public double pagar(double monto) {
        return monto+ monto*0.10;    
    }


}
