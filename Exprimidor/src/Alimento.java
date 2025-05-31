public class Alimento {
    private double peso;
    private double pesoExtra;

    public Alimento(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoExtra() {
        return pesoExtra;
    }

    public void setPesoExtra(double pesoExtra) {
        this.pesoExtra= pesoExtra;
    }
    public double exprimir(){
        return 0;
    }

    /*
    public String toString(){
        return Alimento.class.getName()+" exprime: "+ exprimir();
    }
    */
}
