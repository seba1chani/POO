public class Aerodeslizador implements TransporteTerrestre,TransporteMaritimo {
    private int numRuedas;
    private String nombre;
    private int maxVelocidad;
    private int maxPasajeros;
    private int desplazamiento;

    @Override
    public int getNumRuedas() {
            return this.numRuedas;
    }

    @Override
    public void setNumRuedas(int numruedas) {
        this.numRuedas= numruedas;    
    }

    @Override
    public void manejar() {
        System.out.println("manejando un aerodeslizador");    
    }

    @Override
    public void tocarBocina() {
        System.out.println("sonar");    
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre= nombre;    
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
        this.maxVelocidad= maxv;    
    }

    @Override
    public int getDesplazamiento() {
        return this.desplazamiento;    
    }

    @Override
    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento= desplazamiento;
    }

    @Override
    public void zarpar() {
        System.out.println("el aero esta zarpando");    
    }
    
}
