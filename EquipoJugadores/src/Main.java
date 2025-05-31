public class Main {
    public static void main(String[] args) {

        Fecha fecha1=  new Fecha(20,5,2004,16,30);
        Jugador j1= new Jugador(40325123,"juan",fecha1);
        Jugador j2= new Jugador(397284550,"Martin");
        j2.setFchNac(17,10,1996,15,9);

        Equipo equipo1= new Equipo();
        equipo1.agregarJugador(j1);
        //equipo1.agregarJugador(j2);

        System.out.println(equipo1);



    }
}