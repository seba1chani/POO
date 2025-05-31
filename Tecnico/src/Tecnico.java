import java.util.ArrayList;

public class Tecnico {
    private ArrayList<String> competencias;

    public Tecnico(){
        competencias= new ArrayList<String>();
    }
    public void cargarCompetencia(String competencia){
        if(competencias.indexOf(competencia)!=-1)
            competencias.add(competencia);
    }
    public void eliminarCompetencia(){
        if(!competencias.isEmpty())
            competencias.removeLast();
    }
    public void eliminarCompetencia(String competencia){
        if(!competencias.isEmpty()&& competencias.indexOf(competencia)!= -1)
            competencias.remove(competencia);
    }
    public int cantidadDeCompetencias(){
        return competencias.size();
    }
    public String toString(){
        return "Competencia: "+ competencias;
    }
}
