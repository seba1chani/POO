public class Zanahoria extends Hortaliza{
    public Zanahoria(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }

    @Override
    public double exprimir() {
        return (getPeso()*0.40)-getPesoExtra();
    }

}
