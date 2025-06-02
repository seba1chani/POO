public class Prestacion {
    protected int idPrestacion;
    protected String nombre;
    protected Paciente paciente;
    protected Profesional prestador;
    protected Fecha fchRealizacion;

    public Prestacion(int idPrestacion,String nombre,Paciente paciente,Profesional prestador,Fecha fchRealizacion){
        this.idPrestacion=idPrestacion;
        this.nombre=nombre;
        this.paciente=paciente;
        this.prestador=prestador;
        this.fchRealizacion=fchRealizacion;
    }

    public int getidPrestacion(){
        return this.idPrestacion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    public Profesional getPerstador(){
        return this.prestador;
    }
    public Fecha getFchRealizacion(){
        return this.fchRealizacion;
    }

}
