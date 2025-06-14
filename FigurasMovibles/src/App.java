public class App {
    public static void main(String[] args) throws Exception {
        /*
        CirculoMovible circulo= new CirculoMovible(0, 0, 1, 1, 4);
        System.out.println(circulo);
        circulo.moverArriba();
        System.out.println(circulo);
        circulo.moverDerecha();
        System.out.println(circulo);
        
        RectanguloMovible rectangulo= new RectanguloMovible(1, 1, -1, -1, 1, 1);
        System.out.println(rectangulo);
        rectangulo.moverArriba();
        System.out.println(rectangulo);
        */
        FormasGUI formas= new FormasGUI("Figuras");
        formas.setVisible(true);
    }
}
