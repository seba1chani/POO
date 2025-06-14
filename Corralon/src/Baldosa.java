public class Baldosa extends PiezaCeramica {
    private int peso;

    public Baldosa(int codigo, double precioBase, int peso) {
        super(codigo, precioBase);
        this.peso = peso;
    }

    public int getPeso(){
        return this.peso;
    }
    @Override
    public double getPrecioFinal() {
        return getPrecioBase()+getPeso()*0.034;
    }
    

}
