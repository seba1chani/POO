import java.util.ArrayList;

public class CarritoDeCompra {
    private ArrayList<Libro> carrito;

    public CarritoDeCompra(){
        carrito= new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        carrito.add(libro);
    }
    public void eliminarLibro(Libro libro){
        int pos=0;

            while(!carrito.get(pos).equals(libro) && pos< carrito.size()){
                pos++;
            }
            if(pos<carrito.size())
                carrito.remove(pos);
            else
                System.out.println("Libro no pertenece al carrito");

    }
    public double calcularTotal(){
        double total=0;
        for(int i=0; i< carrito.size();i++){
            total+= carrito.get(i).getPrecio();
        }
        return total;
    }
    public void pagar(TipoDePago tipoDePago){
        System.out.println("El monto a pagar es: "+calcularTotal()+
                " pago: "+tipoDePago.pagar(calcularTotal()));
    }
}
