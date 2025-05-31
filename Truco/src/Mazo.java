import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartasEspaniolas;

    public Mazo() {
        cartasEspaniolas = new ArrayList<>();
    }

    public void crearMazo() {
        for (String palo : Carta.getPalos()) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 & i != 9) {
                    cartasEspaniolas.add(new Carta(i,palo));
                }
            }
        }
    }
    public void mezclar(){
        Collections.shuffle(cartasEspaniolas);
    }
    public boolean estaVacio(){
        return cartasEspaniolas.isEmpty();
    }
    public Carta sacarCarta(){
        if(!estaVacio()){
            return cartasEspaniolas.remove(0);
        }
        else
            return null;
    }

}

