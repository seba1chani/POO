public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1.0,2.5);
        Punto p2 = new Punto(3.0,1.0);
        if(p1.dentroRadio(p2,2.5)){
            System.out.println(p1+" distancia es: "+ p1.distanciaEuclidia(p2)+" dentro del radio ");
        }else{
            System.out.println(p1+" distancia es: "+ p1.distanciaEuclidia(p2)+ " fuera del radio ");
        }




    }
}