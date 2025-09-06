public class Crucero implements TransporteMaritimo {
    private String nombre;
    private int maxPasajeros;
    private int maxVelocidad;
    private int desplazamiento;

    @Override
    public int getDesplazamiento() {
        return this.desplazamiento;    
    }

    @Override
    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento=desplazamiento; 
    }

    @Override
    public void zarpar() {
        System.out.println("el crucero esta zarpando");    
    }

    @Override
    public String getNombre() {
        return this.nombre;    
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;    
    }

    @Override
    public int getMaxPasajeros() {
        return this.maxPasajeros;    
    }

    @Override
    public void setMaxPasajeros(int maxp) {
        this.maxPasajeros= maxp;    
    }

    @Override
    public int getMaxVelocidad() {
        return this.maxVelocidad;
    }

    @Override
    public void setMaxVelocidad(int maxv) {
        this.maxVelocidad=maxv;    
    }

    
}
