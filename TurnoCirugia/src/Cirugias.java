import java.util.ArrayList;

public class Cirugias {
    private ArrayList<Cirugia>cirugias;
    private int cantidad;

public Cirugias(){
    this.cirugias= new ArrayList<>();
    this.cantidad=0;
}

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public void insertarCirugia(Cirugia cirugia){
        int i=0;
        while(i<cirugias.size() && 
            cirugias.get(i).getFchRealizacion().compareTo(cirugia.getFchRealizacion())<0){
                i++;
            }
            cirugias.add(i,cirugia);
            setCantidad(getCantidad()+1);
    }

}
