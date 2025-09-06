public interface TransporteTerrestre extends Transporte {
    public abstract int getNumRuedas();
    public abstract void setNumRuedas(int numruedas);
    public abstract void manejar();
    public abstract void tocarBocina();
}
