public class Efectivo extends TipoDePago{
    public double pagar(double monto){
        return monto-monto*0.10;
    }
}
