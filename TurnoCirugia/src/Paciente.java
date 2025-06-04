public class Paciente extends Persona{
    private ObraSocial obraSocial;

    public Paciente(int dni,String nombre,char sexo,obraSocial){
        super(dni,nombre,sexo);
        this.obraSocial=obraSocial;
    }
}
