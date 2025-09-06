public class Manzana extends Fruta{
    public Manzana(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.75)-getPesoExtra();
    }
    
}
