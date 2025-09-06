public class Jengibre extends Hortaliza{
    public Jengibre(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.30)-getPesoExtra();
    }
}
