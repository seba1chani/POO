import java.util.ArrayList;

public class Pedido {
    private ArrayList<PiezaCeramica>piezas;
    private FormaDePago formaDePago;

    public Pedido(){
        this.piezas= new ArrayList<>();
    }
    public void agregarPieza(PiezaCeramica pieza){
        piezas.add(pieza);
    }
    public void setFormaDePago(FormaDePago formaDePago){
        this.formaDePago=formaDePago;
    }
    public double calcularTotal(){
        double total=0;
        for(PiezaCeramica pieza : piezas){
            total+= pieza.getPrecioFinal();
        }
        return total;
    }
    public void pagar(){
        System.out.println("Total: "+ calcularTotal()+ "precio a pagar: "+
             formaDePago.pagar(calcularTotal()));
    }
}
