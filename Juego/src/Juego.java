import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        Random ran= new Random();
        int token,eleccion;
        Scanner tec= new Scanner(System.in);
        Jugador j1= new Jugador(120.0);

        while(j1.tieneDinero()) {
            j1.setApuesta(50.5);
            if(!j1.puedeApostar()){
                System.out.println("dinero insuficiente");
                break;
            }
            System.out.println("Ingrese su eleccion: ");
                eleccion= tec.nextInt();

                // Bloque mínimo de control
              /*  try {
                    System.out.print("Adivina (1-3): ");
                    eleccion = tec.nextInt();
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Juego reiniciado.");
                    tec.nextLine(); // Limpiar buffer
                    continue; // Saltar a la siguiente iteración
                }
                tec.nextLine(); // Limpiar buffer después del número*/
                token = ran.nextInt(3)+1;

                if (token == eleccion) {
                    j1.setDinero(j1.getDinero() + (j1.getApuesta() * 2));
                    System.out.println("Ganaste ");
                } else {
                    j1.setDinero(j1.getDinero() - j1.getApuesta());
                    System.out.println("Perdiste ");
                }

                System.out.println("Desea continuar: Y/N ");
                if(tec.next().equalsIgnoreCase("n"))
                    break;
            }
        System.out.println("Juego finalizado "+ j1);
        tec.close();
    }

}