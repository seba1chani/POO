public class Main {
    public static void main(String[] args) {

         Naranja n,n2;
        // double jugo;
         n= new Naranja();
         n2= new Naranja();
         n2.peso= 48;
         n.peso=100;
         n.huerto= "Carlitos";
         //jugo= n.exprimir();
        System.out.println(n2.exprimir());

    }
}