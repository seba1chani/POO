public class Tanque {
    private double capTotal;
    private double capActual;
    private boolean vacio;

    public Tanque(double capTotal) {
        this.capTotal = capTotal;
    }

    public double getCapTotal() {
        return capTotal;
    }

    public double getCapActual() {
        return capActual;
    }

    public void setCapActual(double capActual) {
        this.capActual = capActual;
    }

    public boolean isVacio() {
        return getCapActual()==0;
    }

    //metodo para cargar nafta
    public void cargarNafta(double carga){
        if(carga+getCapActual() <= getCapTotal())
            setCapActual(getCapActual()+carga);
    }
    public double getConsumo(){
        double consumo=0;
        consumo= getCapActual()-consumo;
        return consumo;
    }
    //metodo para consumir la nafta
    public void consumirNafta (double consumo){
        double consumido=0;
        if(consumo<= getCapActual())
            consumido=getConsumo();

        if(consumido <= 0)
            setCapActual(0);
        else
            setCapActual(consumido);

    }
    //getconsumo && puedeMoverse

}
