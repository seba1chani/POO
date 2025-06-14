public class RectanguloMovible {
    private PuntoMovible supIzq;
    private PuntoMovible infDer;

    public RectanguloMovible(int x1,int y1,int x2,int y2,int xVelocidad,int yVelocidad){
        this.supIzq= new PuntoMovible(x1, y1, xVelocidad, yVelocidad);
        this.infDer= new PuntoMovible(x2, y2, xVelocidad, yVelocidad);
    }

    @Override
    public String toString() {
        return "RectanguloMovible [supIzq=" + supIzq + ", infDer=" + infDer + "]";
    }
    public void moverArriba(){
        supIzq.moverArriba();
        infDer.moverArriba();
    }
    public void moverAbajo(){
        supIzq.moverAbajo();
        infDer.moverAbajo();
    }
    public void moverDerecha(){
        supIzq.moverDerecha();
        infDer.moverDerecha();
    }
    public void moverIzquierda(){
        supIzq.moverIzquierda();
        supIzq.moverIzquierda();
    }

    public int getX() {
        return Math.min(supIzq.getX(), infDer.getX());
    }
    public int getY() {
        return Math.min(supIzq.getY(), infDer.getY());
    }
    public int getAncho() {
        return Math.abs(supIzq.getX() - infDer.getX());
    }
    public int getAlto() {
        return Math.abs(supIzq.getY() - infDer.getY());
    }

    
}
