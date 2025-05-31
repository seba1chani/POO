public class Paciente {

    private int dni;
    private String nombre;

    public Paciente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
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
    public boolean equals(Object objeto){
        Paciente aux = (Paciente) objeto;
        return this.dni== aux.getDni();
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
