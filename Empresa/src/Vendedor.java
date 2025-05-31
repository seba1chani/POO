public class Vendedor extends Empleado{
    private Auto coche;
    private long telMovil;
    public Vendedor(String nombreCompleto,int DNI,String dir,
            int anio,int mes,int dia,int hora,int min,int tel,double sal,
                    Empleado supervisor,String matri,String marca,String modelo,long telMovil){

        super(nombreCompleto,DNI,dir,dia,mes,anio,hora,min,tel,sal,supervisor);
        this.coche=new Auto(matri,marca,modelo);
        this.telMovil=telMovil;
    }
    public long getTelmovil(){
        return this.telMovil;
    }
    public String getCoche(){
        return this.coche.toString();
    }
    public void aumentarSalario(){
        setSalario((getSalario()*12)*0.002 + getaniosAntiguedad()*12000);
    }

    public String toString(){
        return "Telefono Movil: "+getTelmovil()+ "\n"+"Vehiculo: "+getCoche()+"\n"+
                super.toString()+"\n";
    }
}
