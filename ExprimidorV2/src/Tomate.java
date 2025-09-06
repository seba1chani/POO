public class Tomate extends Fruta{
    public Tomate(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.80)-getPesoExtra();    
    }
    
}
