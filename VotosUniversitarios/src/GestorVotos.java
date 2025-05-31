import java.util.ArrayList;

public class GestorVotos {
    private ArrayList<Alumno>alumnos;
    private ArrayList<Docente>docentes;
    private ArrayList<PersonalMaestranza>perMaestranza;

    public GestorVotos(){
        alumnos=new ArrayList<>();
        docentes= new ArrayList<>();
        perMaestranza= new ArrayList<>();

    }
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public void agregarDocente(Docente docente){
        docentes.add(docente);
    }
    public void agregarMaestranza(PersonalMaestranza pMaes){
        perMaestranza.add(pMaes);
    }
    public ArrayList<Alumno> alumnosRegulares(){
        ArrayList<Alumno>alumnosRegulares= new ArrayList<>();
        for(Alumno alumno: alumnos){
            if(alumno.getEstado()){
                alumnosRegulares.add(alumno);
            }
        }
        return alumnosRegulares;
    }
    public ArrayList<Docente> docentesRegulares(){
        ArrayList<Docente>docenteRegulares= new ArrayList<>();
        for(Docente docente: docentes){
            if(docente.getEstado()){
                docenteRegulares.add(docente);
            }
        }
        return docenteRegulares;
    }
    public ArrayList<PersonalMaestranza>getlistaPersonalMaez(){
        return perMaestranza;
    }

}
