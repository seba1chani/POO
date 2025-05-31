import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador>jugadores;

    public Equipo(){
        jugadores= new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador){
        if(jugadores.indexOf(jugador)==-1){
            jugadores.add(jugador);
        }
    }
    public void eliminarJugador(Jugador jugador){
        if(!jugadores.isEmpty()&& jugadores.indexOf(jugador)!=-1)
            jugadores.remove(jugador);
    }
    public String toString(){
        return "Jugador: "+jugadores;
    }

}
