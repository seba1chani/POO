public class Motor {
    private double consumoXMin;
    private double distanciaXLitro;
    public boolean encendido;

    public Motor(double consumoXMin,double distanciaXLitro){
        this.consumoXMin=consumoXMin;
        this.distanciaXLitro= distanciaXLitro;
    }

    public double getDistanciaXLitro() {
        return distanciaXLitro;
    }

    public double getConsumoXMin() {
        return consumoXMin;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


}
