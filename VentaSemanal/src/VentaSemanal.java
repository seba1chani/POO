import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VentaSemanal {
    private double[] ventas;

    public VentaSemanal(){
        this(7);
    }
    public VentaSemanal(int tam){
        if(tam<=7 && tam>0) {
            this.ventas = new double[tam];
            Arrays.fill(ventas,-1);
        }else{
            System.out.println("Entrada Invalida");
        }
    }
    public  VentaSemanal(double[] ventas){
        this.ventas= ventas;
    }
    public void cargarVentas(){
        int dia, venta;
        Scanner tec = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("ingrese dia a cargar 1.."+ventas.length);
                dia = tec.nextInt();
                if(dia==0)
                    break;
                if(dia<1 || dia >ventas.length){
                    System.out.println("dia invalido. Intente de nuevo");
                    continue;
                }
                System.out.println("Ingrese venta ");
                venta=tec.nextInt();
                ventas[dia-1]=venta;
            }
            catch (InputMismatchException e){
                System.out.println(" Error, ingrese un numero");
                tec.nextLine();
            }
        }
        /* try {
            dia = tec.nextInt();
            while (dia > 0 && dia<= ventas.lenght) {
                System.out.println("ingrese la venta ");
                venta = tec.nextInt();
                ventas[dia - 1] = venta;
                System.out.println("ingrese dia a cargar 1.."+ventas.lenght);
                dia = tec.nextInt();
            }
        }catch(InputMismatchException e){
            System.out.println("Ocurrio un error ingresar un num entero");
            tec.nextLine();
        }*/
        tec.close();
    }
    public double totalVentaSemanal(){
        double totalSemanal=0;
        for(int i=0;i<ventas.length;i++){
            if(ventas[i]>=0)
                totalSemanal+= ventas[i];
        }
        return totalSemanal;
    }
    public double promedioVentaSemanal(){
        double prom;
        int contDias=0;
        for (double venta : ventas) {
            if (venta != 0.0 && venta>=0.0)
                contDias++;
        }
        prom= totalVentaSemanal()/contDias;

        return prom;
    }

    public String diaConMasVentas(){
        String[] dia= {" Lunes"," Martes"," Miercoles"," Jueves"," Viernes"," Sabado"," Domingo"};
        String diaLab=" Dias trabajados: ";
        boolean estado= true;
        double maxVentas=ventas[0];
        int pos=0;
        for (int i=1;i<ventas.length;i++){
            if(maxVentas<ventas[i]){
                maxVentas=ventas[i];
                pos=i;
            }
            if(ventas[i-1]!=-1){
                diaLab += dia[i - 1];
                estado=false;
            }


        }
        if(!estado)
            return dia[pos]+diaLab;
        else
            return " no hay y "+ "no hubo dias Laburados";
    }

}
