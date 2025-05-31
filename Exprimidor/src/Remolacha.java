public class Remolacha extends Hortaliza {

    public Remolacha(double peso){
        super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.70) - getPesoExtra();
    }
}
