public class Fruta extends Alimento {

    public Fruta(double peso) {
        super(peso);

    }
    public double getPesoExtra(){
        return getPeso()*0.10;
    }

}
