public class Main {
    public static void main(String[] args) {

       VentaAnual ventaAnual= new VentaAnual(5);
       ventaAnual.cargarAleatoriamente();
        System.out.println(ventaAnual);
        //ventaAnual.setVentas(8,1,12);
        //ventaAnual.getVentas(8,1);
        System.out.println(ventaAnual.ventaVendedor(4));
        System.out.println(ventaAnual.calcularVentasBimestral(1));
        System.out.println(ventaAnual.ventaTotal());
    }
}