public class Zanahoria extends Hortaliza {
    public Zanahoria(double peso){
        super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.40) - getPesoExtra();
    }
}
