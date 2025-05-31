import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Alimento>alimentos= new ArrayList<Alimento>();
        Alimento manzana= new Manzana(200);
        Alimento pera= new Pera(150);
        Alimento zanahoria= new Zanahoria(300);
        Alimento jengibre = new Jengibre(1450);

        alimentos.add(manzana);
        alimentos.add(pera);
        alimentos.add(zanahoria);
        alimentos.add(jengibre);

        for(int i=0;i<alimentos.size();i++){
            System.out.println(alimentos.get(i).getClass()+
                    " : " +alimentos.get(i).exprimir());
        }

    }
}