public class Jeep implements TransporteTerrestre {
    private int numRuedas;
    private String nombre;
    private int maxPasajeros;
    private int maxVelocidad;
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
        System.out.println("el jeep esta siendo manejado");
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
        this.maxPasajeros=maxp;    
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
