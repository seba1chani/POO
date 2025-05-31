public class CartasEspaniola extends Cartas{

    private static final String[] TIPOS_VALIDOS = {"espada", "oro", "copa", "basto"};
    public CartasEspaniola(int numero, String tipo) {
        super(validarNum(numero), validarTipo(tipo));
    }
    private static int validarNum(int n){
        if(n>=1 && n<=12){
            return n;
        }else {
            System.out.println("fuera del rango");
            return 1;
        }
    }

    private static String validarTipo(String tipo){
        for(String t: TIPOS_VALIDOS){
            if(t.equalsIgnoreCase(tipo))
                return t;
        }
        System.out.println("tipo invalido");
        return "espada";
    }
    public String[] getTipos(){
        return TIPOS_VALIDOS;
    }

}
