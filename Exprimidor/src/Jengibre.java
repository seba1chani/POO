public class Jengibre extends Hortaliza {

    public Jengibre(double peso){
        super(peso);
    }

    public double exprimir(){
        return (getPeso()*0.30) - getPesoExtra();
    }
}
