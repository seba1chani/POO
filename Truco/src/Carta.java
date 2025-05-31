public class Carta {
    private int numero;
    private String tipo;
    private static final String[] PALOS ={"espada","basto","oro","copa"};

    public Carta(int numero, String tipo){
        if(numero>=1 && numero<=12)
            this.numero=numero;

        if(esTipo(tipo))
            this.tipo=tipo;
    }
    public boolean esTipo(String tipo){
        for(String palo: PALOS){
            if(palo.equalsIgnoreCase(tipo))
                return true;
        }
        return false;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getTipo(){
        return this.tipo;
    }
    public static String[] getPalos(){
        return PALOS.clone();
    }

}
