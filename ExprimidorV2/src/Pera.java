public class Pera extends Fruta{
    public Pera(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.85)-getPesoExtra();
    }
    
}
