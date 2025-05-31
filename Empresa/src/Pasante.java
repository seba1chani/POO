public class Pasante extends Empleado{
    private int tiempoContrato;
    private boolean estado;

    public Pasante(String nombreCompleto,int DNI,String dir,
                   int anio,int mes ,int dia,int hora,int min,int tel,double sal,Empleado supervisor,
                   int tiempoContrato, boolean estado){
        super(nombreCompleto,DNI,dir,dia,mes,anio,hora,min,tel,sal,supervisor);

        this.tiempoContrato=tiempoContrato;
        this.estado= true;
    }
    public int getTiempoContrato(){
        return this.tiempoContrato;
    }
    public String getEstado(){
        if (estado && this.tiempoContrato>=90)
            return "Contratado";
        if(!estado && this.tiempoContrato>=90)
            return "No contratado";
        else
            return "En curso";
    }

    public void aumentarSalario(){
        setSalario((getSalario()*12)* 0.0005);
    }

    public String toString(){
        return super.toString()+"\n"+"Tiempo Contratado: "+
                getTiempoContrato()+"\n"+"Se encuentra en: "+
                getEstado();
    }

}
