public class Main {
    public static void main(String[] args) {

        Complejo c1 = new Complejo();
        c1.real=5;
        c1.imaginario=2;
        Complejo c2= new Complejo();
        c2.real= 4;
        c2.imaginario= 3;
        Complejo c3= new Complejo();
        c3.suma(c1,c2);
        System.out.println(c3);
        c3.resta(c1,c2);
        System.out.println(c3);
    }
}