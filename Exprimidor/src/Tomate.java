public class Tomate extends Hortaliza {

    public Tomate(double peso){
        super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.80) - getPesoExtra();
    }
}
