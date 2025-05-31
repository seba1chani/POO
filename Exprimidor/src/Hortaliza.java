public class Hortaliza extends Alimento{

    public Hortaliza(double peso) {
        super(peso);
        //setPesoExtra(peso*0.05);
    }
    public double getPesoExtra(){
        return getPeso()*0.05;
    }


}
