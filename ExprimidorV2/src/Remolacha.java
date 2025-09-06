public class Remolacha extends Hortaliza {
    public Remolacha(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.70)-getPesoExtra();
    }
}
