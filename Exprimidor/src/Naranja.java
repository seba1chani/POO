public class Naranja extends Fruta{

    public Naranja(double peso){
        super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.90) - getPesoExtra();
    }

}
