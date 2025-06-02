public class Profesional extends Persona{
    private int matricula;

public Profesional(int dni,String nombre,char sexo,Fecha fecha,int matricula){
    super(dni,nombre,sexo,fecha);
    this.matricula=matricula;
}
   public String getNombre() {
        return nombre;
    }

}