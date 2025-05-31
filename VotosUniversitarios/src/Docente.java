import java.util.ArrayList;

public class Docente extends PersonaUniversitaria{
    private ArrayList<String>asignaturas;
    public Docente(int dni, String nombreCompleto,ArrayList<String>asignaturas){
        super(dni,nombreCompleto);
        this.asignaturas=asignaturas;
        actualizarEstado();
    }

public boolean esRegular(){
        return !asignaturas.isEmpty();
}

public ArrayList<String> getAsignaturas(){
        return asignaturas;
}
public void agregarAsignatura(String asignatura){
        asignaturas.add(asignatura);
        actualizarEstado();
}
public void quitarAsignatura(String asignatura){
        asignaturas.remove(asignatura);
        actualizarEstado();
}

public void actualizarEstado(){
        this.estado= esRegular();
}

public String toString(){
        return super.toString()+" Asignaturas: "+ getAsignaturas();
}

}
