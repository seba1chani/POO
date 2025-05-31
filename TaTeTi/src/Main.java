import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        Tablero tablero= new Tablero();
        tablero.cargarTablero();

        System.out.println("Elija 1->X o -1->O ");
        int token= entrada.nextInt();
        if(token != 1 && token!=-1){
            System.out.println(" Error ingresando token");
            return;
        }
        tablero.setToken(token);

        boolean turnoJugador= (token==1);
        int ganador=0;
        while(tablero.estaVacio() && ganador==0){
            if(turnoJugador) {
                System.out.println("Ingrese fila: ");
                int fila = entrada.nextInt();
                System.out.println("Ingrese columna: ");
                int col = entrada.nextInt();
                tablero.juegoJugador(fila, col);
                ganador= tablero.obtenerGanador(fila,col);
                if (ganador != 0) {
                    System.out.println(" Gano el jugador ");
                    break;
                }
            }else{
                tablero.juegoPc();
                for(int i=0;i<3;i++){
                    for(int j=0; j<3;j++){
                        ganador= tablero.obtenerGanador(i,j);
                        if(ganador!=0){
                            System.out.println("Gano la PC");
                            break;
                        }
                    }
                    if(ganador!=0)
                        break;
                }

            }
            turnoJugador= !turnoJugador;
            System.out.println(tablero);
        }
        if(ganador==0)
            System.out.println(" empate ");

        entrada.close();

    }
}