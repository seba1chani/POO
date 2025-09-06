public class Naranja extends Fruta {
    public Naranja(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.90)-getPesoExtra();    
    }
    
}
