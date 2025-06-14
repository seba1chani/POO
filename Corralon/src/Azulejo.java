public class Azulejo extends PiezaCeramica {
    private int medida;

    public Azulejo(int codigo, double precioBase, int medida) {
        super(codigo, precioBase);
        this.medida = medida;
    }

    public int getMedida(){
        return this.medida;
    }
    @Override
    public double getPrecioFinal() {
        return getPrecioBase()+getMedida()* 3.05;
    }
    
}
