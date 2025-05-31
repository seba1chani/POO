public class Juego {
    public static void repartir(Carta[] j1, Carta[] j2, Carta[] j3, Carta[] j4, Mazo mazo) {
        for (int i = 0; i < 3; i++) {
            j1[i] = mazo.sacarCarta();
            j2[i] = mazo.sacarCarta();
            j3[i] = mazo.sacarCarta();
            j4[i] = mazo.sacarCarta();
        }
    }

    public static boolean esFlor(Carta[] manoJ) {
        String tipoReferencia = manoJ[0].getTipo();
        for (int i = 1; i < 3; i++) {
            if (!manoJ[i].getTipo().equalsIgnoreCase(tipoReferencia))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.crearMazo();
        mazo.mezclar();
        Carta[] manoJ1 = new Carta[3];
        Carta[] manoJ2 = new Carta[3];
        Carta[] manoJ3 = new Carta[3];
        Carta[] manoJ4 = new Carta[3];
        repartir(manoJ1, manoJ2, manoJ3, manoJ4, mazo);
        if (esFlor(manoJ1)) {
            System.out.println("es Flor ");
        } else
            System.out.println("No es Flor");
        if (esFlor(manoJ2)) {
            System.out.println("es Flor ");
        } else
            System.out.println("No es Flor");

        if (esFlor(manoJ3)) {
            System.out.println("es Flor ");
        } else
            System.out.println("No es Flor");
        if (esFlor(manoJ4)) {
            System.out.println("es Flor ");
        } else
            System.out.println("No es Flor");

    }

}