public class Jugador {
    private int dni;
    private String nombre;
    private Fecha fchNac;

   public Jugador(int dni,String nombre,Fecha fchNac){
        this.dni=dni;
        this.nombre=nombre;
        this.fchNac= fchNac;
    }
    public Jugador(int dni,String nombre){
       this.dni=dni;
       this.nombre=nombre;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFchNac() {
        return fchNac;
    }

    public boolean equals(Object objeto){
        Jugador aux = (Jugador) objeto;
        return this.dni==aux.getDni();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", fchNac=" + fchNac +
                '}';
    }

    public void setFchNac(int dia,int mes,int anio,int min,int hora) {
        this.fchNac = new Fecha(dia,mes,anio,hora,min);
    }
}
