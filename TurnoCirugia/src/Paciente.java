
import java.time.temporal.ChronoUnit;

public class Paciente extends Persona{
    ObraSocial obraSocial;
    
    public Paciente(int dni,String nombre,char sexo,Fecha fecha){
        super(dni, nombre, sexo,fecha);
    }

    public boolean esIgual(Paciente otro){
        return this.dni== otro.dni;
    }
    public int edad(){
        return this.fecha.diferenciasAnios();
    }

}
