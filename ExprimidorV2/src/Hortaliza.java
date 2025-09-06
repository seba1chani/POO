public abstract class Hortaliza extends Alimento implements Exprimible{
    public Hortaliza(double peso,double pesoExtra){
        super(peso, pesoExtra);
    }
    public double getPesoExtra(){
        return this.getPeso()*0.05;
    }
}
