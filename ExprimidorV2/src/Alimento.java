public abstract class Alimento {
    private double peso;
    private double pesoExtra;

    public Alimento(double peso){
        this.peso= peso;
    }
    public double getPeso(){
        return this.peso;
    }
    public abstract double exprimir();

}
