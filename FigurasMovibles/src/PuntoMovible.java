public class PuntoMovible implements Movible{
    private int x;
    private int y;
    private int xVelocidad;
    private int yVelocidad;
    public PuntoMovible(int x, int y, int xVelocidad, int yVelocidad) {
        this.x = x;
        this.y = y;
        this.xVelocidad = xVelocidad;
        this.yVelocidad = yVelocidad;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getXVelocidad() {
        return xVelocidad;
    }
    public void setXVelocidad(int xVelocidad) {
        this.xVelocidad = xVelocidad;
    }
    public int getYVelocidad() {
        return yVelocidad;
    }
    public void setYVelocidad(int yVelocidad) {
        this.yVelocidad = yVelocidad;
    }
    @Override
    public String toString() {
        return "PuntoMovible [x=" + getX() + ", y=" + getY() +
         ", xVelocidad=" + getXVelocidad() + ", yVelocidad=" + getYVelocidad() + "]";
    }
    @Override
    public void moverArriba() {
        setY(getY()+ (1*getYVelocidad()));
    }
    @Override
    public void moverAbajo() {
        setY(getY()+(1*getYVelocidad()));
    }
    @Override
    public void moverIzquierda() {
        setX(getX()-(getYVelocidad()*1));
    }
    @Override
    public void moverDerecha() {
        setX(getX()+(getXVelocidad()*1));
    }
    
    
    
}
