public abstract class Fruta extends Alimento implements Exprimible{
    public Fruta(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }
    public double getPesoExtra(){
        return getPeso()*0.10;
    }
}
