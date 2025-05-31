public class Alumno  extends PersonaUniversitaria{
    private int materiasAprobadas;

    public Alumno(int DNI,String nombreCompleto,int materias){
        super(DNI,nombreCompleto);
        this.materiasAprobadas =materias;
        actualizarEstado();
    }
    public int getMateriasAprobadas(){
        return this.materiasAprobadas;
    }
    public void aprobarMateria(){
        this.materiasAprobadas++;
        actualizarEstado();
    }
    private void actualizarEstado(){
        this.estado= materiasAprobadas>=2;
    }
    public String toString(){
        return super.toString()+" Materias aprobadas: "
                +getMateriasAprobadas();
    }
}
