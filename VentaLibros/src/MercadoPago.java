public class MercadoPago extends TipoDePago{
    public double pagar(double monto){
        return monto+monto*0.15;
    }
}
