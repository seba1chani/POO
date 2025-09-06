
import java.util.ArrayList;

public class ListaAlumno {
    private ArrayList<AbsStudent>alumnos= new ArrayList<>();

    public ListaAlumno(){
        alumnos= new ArrayList<>();
    }
    public void agregarAlumno(AbsStudent alumno){
        alumnos.add(alumno);
    }
    public int contarRegulares(){
        int cont=0;
        for(AbsStudent estudiante: alumnos){
            if(estudiante.estaRegular()){
                cont++;
            }
        }
        return cont;
    }
    public int contarAusentes(){
        int cont=0;
        for(AbsStudent estudiante: alumnos){
            if(estudiante.estaAusente()){
                cont++;
            }
        }
        return cont;
    }
    public int contarLibres(){
        int cont=0;
        for(AbsStudent estudiante: alumnos){
            if(estudiante.estaLibre()){
                cont++;
            }
        }
        return cont;
    }

}
