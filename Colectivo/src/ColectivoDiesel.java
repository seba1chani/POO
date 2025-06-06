public class ColectivoDiesel extends Colectivo implements IDiesel{
    private double nivelContaminacion;
    private double distancia;
    
    public ColectivoDiesel(int capacidad, double costo,double nivelContaminacion,double distancia) {
        super(capacidad, costo);
        this.nivelContaminacion=nivelContaminacion;
        this.distancia=distancia;
    }

    @Override
    public double getAcel() {
        return 3.0;
    }

    @Override
    public double getDistancia() {
        return this.distancia;
    }

    @Override
    public double getNivelContaminacion() {
        return this.nivelContaminacion;
    }
    
}
