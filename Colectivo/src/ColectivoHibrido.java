public class ColectivoHibrido extends Colectivo implements IDiesel,IElectrico{
    private double voltaje;
    private double distancia;
    private double nivelContaminacion;

    public ColectivoHibrido(int capacidad,double costo,double voltaje,double distancia,double  nivelContaminacion){
        super(capacidad, costo);
        this.voltaje=voltaje;
        this.distancia=distancia;
        this.nivelContaminacion=nivelContaminacion;
    }
    public double getDistancia(){
        return this.distancia;
    }
    public double getNivelContaminacion(){
        return this.nivelContaminacion;
    }
    public double getVoltaje(){
        return this.voltaje;
    }
    public double getAcel(){
        return 4.0;
    }

}
