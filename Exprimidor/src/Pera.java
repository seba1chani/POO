public class Pera extends Fruta{
    public Pera(double peso){
            super(peso);
    }
    public double exprimir(){
        return (getPeso()*0.85)-getPesoExtra();
    }

}
