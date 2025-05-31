import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Autor>autores= new ArrayList<>();
        Autor au= new Autor("Edgar Alan Poe");
        au.setGooddreads("bueno");
        autores.add(au);
        Autor au1= new Autor("Lovecraft");
        au1.setGooddreads("muy bueno");
        autores.add(au1);
        Autor au2= new Autor("Charles Dickens");
        au2.setGooddreads("clasico");
        autores.add(au2);

        Formato formato= new Papel("Tapa Dura");
        Formato formato1= new Digital("mobi");
        Formato formato2= new Digital("pdf");

        TipoDePago pagoMercadoPago= new MercadoPago();
        TipoDePago pagoEfectivo= new Efectivo();
        TipoDePago PagoTarjetaCredito= new TarjetaDeCredito();

        Libro lib= new Libro(121,autores,formato,3500);
        ArrayList<Autor> autorLibro =lib.getAutores();

        for(Autor autor: autorLibro){
            System.out.println("Nombre: "+ autor.getNombre());
            System.out.println("Gooddread: "+autor.getGooddreads());
        }
        System.out.println(lib.getIsbn()+" "+lib.getFormato().getTipo()+" "+
                lib.getPrecio());
        Libro lib2= new Libro(4512,autores,formato1,6000);
        System.out.println(lib2.getIsbn()+" "+lib2.getFormato().getTipo()+" "+
                lib2.getPrecio());
        //Libro lib3= new Libro(7898,autores,formato2,7000);

        CarritoDeCompra carritoDeCompra= new CarritoDeCompra();
        carritoDeCompra.agregarLibro(lib);
        carritoDeCompra.agregarLibro(lib2);
        System.out.println(carritoDeCompra.calcularTotal());
        carritoDeCompra.pagar(pagoMercadoPago);
        carritoDeCompra.eliminarLibro(lib);
        System.out.println(carritoDeCompra.calcularTotal());
        carritoDeCompra.pagar(pagoEfectivo);
        //carritoDeCompra.agregarLibro(lib2);
        //carritoDeCompra.agregarLibro(lib3);

    }
}