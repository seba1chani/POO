public class Secretario extends Empleado {
    private String despacho;
    private int fax;
    public Secretario(String nombreCompleto,int DNI,String dir,
                      int dia, int mes, int anio,int hora, int min
            ,int tel,double sal,Empleado supervisor, String despacho, int fax){
        super(nombreCompleto,DNI,dir,dia,mes,anio,hora,min,tel,sal,supervisor);

        this.despacho=despacho;
        this.fax=fax;
    }
    public String getDespacho(){
        return this.despacho;
    }
    public int getFax(){
        return this.fax;
    }

    public void aumentarSalario(){
        setSalario((getSalario()*12) *0.001 + getaniosAntiguedad()* 10000);
    }

    public String toString(){
        return  "Despacho: " + getDespacho()+"\n" +"Fax: "+getFax()+"\n"+ super.toString()+"\n";
    }
}
