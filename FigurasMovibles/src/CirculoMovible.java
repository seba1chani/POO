public class CirculoMovible implements Movible{
    private int radio;
    private PuntoMovible centro;

    public CirculoMovible(int x, int y, int xVelocidad,int yVelocidad, int radio) {
        this.radio = radio;
        this.centro= new PuntoMovible(x, y, xVelocidad, yVelocidad);
    }

    public int getX(){
        return centro.getX();
    }
    public int getY(){
        return centro.getY();
    }
    public int getDiametro(){
        return radio*2;
    }
    public void setX(int x){
        this.centro.setX(x);
    }
    public void setY(int y){
        this.centro.setY(y);
    }
    public void setRadio(int radio){
        this.radio= radio;
    }

    @Override
    public String toString() {
        return "CirculoMovible [radio=" + radio + ", centro=" + centro + "]";
    }

    @Override
    public void moverArriba() {
        centro.moverArriba();
    }

    @Override
    public void moverAbajo() {
        centro.moverAbajo();    
    }

    @Override
    public void moverIzquierda() {
        centro.moverIzquierda();
    }

    @Override
    public void moverDerecha() {
        centro.moverDerecha();    
    }

    

}
