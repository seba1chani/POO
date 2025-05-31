
public class Empleado {
    private String nombreCompleto;
    private int DNI;
    private String direccion;
    private Fecha fechaIngreso;
    private int telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombreCompleto,int DNI,String dir,
                    int dia, int mes, int anio,int hora, int min
            ,int tel,double sal){
        this.nombreCompleto= nombreCompleto;
        this.DNI=DNI;
        this.direccion=dir;
        this.fechaIngreso =new Fecha(dia,mes,anio,hora,min);
        this.telefono=tel;
        this.salario=sal;
    }
    public Empleado(String nombreCompleto,int DNI,String dir,
                    int dia, int mes, int anio,int hora, int min
            ,int tel,double sal,Empleado supervisor){
        this(nombreCompleto,DNI,dir,dia,mes,anio,hora,min,tel,sal);
        this.supervisor= supervisor;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    public int getDNI(){
        return this.DNI;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getaniosAntiguedad(){
        return this.fechaIngreso.diferenciaAnios();
    }
    public int getTelefono(){
        return this.telefono;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double sal){
        this.salario=sal;
    }

    public Empleado getSupervisor(){
        return this.supervisor;
    }

    public void aumentarSalario(){

    }

    public String toString(){
        String cad;
        if(getSupervisor()!= null) {
            cad = "Nombre Completo: " + getNombreCompleto() + "\n" + "DNI: " + getDNI() + "\n" +
                    "Direccion: " + getDireccion() + "\n" + "Fecha de antiguedad: " + getaniosAntiguedad() + "\n"
                    + "Telefono: " + getTelefono() + "\n" + "Salario: " + getSalario() + "\n" +
                    "Datos del supervisor:----- " + "\n" + getSupervisor();
        }else{
            cad = "Nombre Completo: " + getNombreCompleto() + "\n" + "DNI: " + getDNI() + "\n" +
                    "Direccion: " + getDireccion() + "\n" + "Fecha de antiguedad: " + getaniosAntiguedad() + "\n"
                    + "Telefono: " + getTelefono() + "\n" + "Salario: " + getSalario();
        }
        return cad;
    }

}
