public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido= new Pedido();
        Azulejo azulejo1= new Azulejo(1, 500, 10);
        Baldosa baldosa1= new Baldosa(2, 900, 200);
        pedido.agregarPieza(azulejo1);
        pedido.agregarPieza(baldosa1);
        pedido.setFormaDePago(new TarjetaDeCredito());
        pedido.pagar();

    }
}
