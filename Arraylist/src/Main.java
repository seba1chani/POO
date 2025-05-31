import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
        listaDeEnteros.add(Integer.valueOf(8));
        listaDeEnteros.add(Integer.valueOf(1));
        listaDeEnteros.add(Integer.valueOf(10));
        listaDeEnteros.add(Integer.valueOf(8));
        System.out.println(listaDeEnteros.indexOf(Integer.valueOf(8)));
        System.out.println(listaDeEnteros);
        System.out.println(listaDeEnteros.size());
    }
}