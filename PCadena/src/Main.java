public class Main {
    public static void main(String[] args) {

        Cadena cad;
        cad= new Cadena();
        //cad.linea= "hola chicos de POO 2025";
        cad.linea= "en casa, pero trabajando";
        System.out.println(cad.cantidadCaracteres());
        System.out.println(cad.cantidadPalabras());
        System.out.println(cad.contarVocales());
        System.out.println(cad.contadorConsonantes());
    }
}