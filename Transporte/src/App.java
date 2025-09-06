
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Transporte>vehiculos= new ArrayList<>();
        Jeep v1= new Jeep();
        Aerodeslizador v2= new Aerodeslizador();
        Crucero v3= new Crucero();
        Patrullero v4= new Patrullero();
        v1.setNombre("honda");
        v1.setMaxPasajeros(4); 
        v1.setNumRuedas(4);
        v1.setMaxVelocidad(120);
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);

        for(Transporte v: vehiculos){
            if(v instanceof TransporteTerrestre){
                ((TransporteTerrestre)v).tocarBocina();
            }
        }

    }
}
