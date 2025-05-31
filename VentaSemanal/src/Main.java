public class Main {
    public static void main(String[] args) {

        VentaSemanal v1= new VentaSemanal(4);
        v1.cargarVentas();
        double ventaSemanal= v1.totalVentaSemanal();
        double promSemanal= v1.promedioVentaSemanal();

        System.out.println("Ventas Semanal "+ ventaSemanal+ " Promedio Semanal "+ promSemanal
                            +" ,el dia con mas ventas"+ v1.diaConMasVentas());
    }
}