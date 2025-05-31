import java.util.Scanner;

public class OMSTesting {
    public static void main(String[] args) {

       // Virus v2= new Virus();
        Virus v1= new Virus("Covid");
        int cont=0;
        Scanner tec= new Scanner(System.in);
        System.out.println(v1);
        while(v1.esNocivo()){
            System.out.println("ingrese un adn");
            v1.neutralizar(tec.nextInt());
            cont++;
            if(v1.esNocivo()){
                System.out.println("Virus no Neutralizado ");
            }
        }
        tec.close();
        System.out.println(v1 + " fue neutralizado en " + cont +" intentos");
        //System.out.println(v2);

    }
}