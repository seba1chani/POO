public class Manzana extends Fruta{

    public Manzana(double peso) {
        super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.75)- getPesoExtra() ;
    }
}
