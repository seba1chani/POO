public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distanciaEuclidia(Punto p){
        return Math.sqrt( Math.pow(this.x - p.x,2.0)+ Math.pow(this.y - p.y,2.0));
    }
    public boolean dentroRadio(Punto medio, double r){
        return (distanciaEuclidia(medio)<= r);
    }
    public String toString(){
        return ("Cordenadas: "+this.x+" "+this.y);
    }
}
