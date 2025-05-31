import java.util.Random;

public class VentaAnual {
    private double [][]ventas;
    private int cantaVendedores;

    public VentaAnual(int cantVendedores){
        this.ventas= new double[6][cantVendedores];
        this.cantaVendedores= cantVendedores;
    }
    public void setVentas(int vendedor, int bimestre, double monto){
        if(bimestre>=0 && bimestre<this.ventas.length){
            if(vendedor< this.ventas[0].length && vendedor>=0){
                this.ventas[bimestre][vendedor]=monto;
            }else{
                System.out.println("Error en tam de columnas");
            }
        }else {
            System.out.println("Error en tam de filas");
        }
    }
    public double getVentas(int vendedor, int bimestre){
        double valor=0;
        if(bimestre>=0 && bimestre<this.ventas.length){
            if(vendedor< this.ventas[0].length && vendedor>=0){
                valor=this.ventas[bimestre][vendedor];
            }else{
                System.out.println("Error en tam de columnas");
            }
        }else {
            System.out.println("Error en tam de filas");
        }
        return  valor;
    }
    public void cargarAleatoriamente(){
        for(int i=0; i<this.ventas.length;i++){
            for(int j=0;j<this.ventas[0].length;j++){
                this.ventas[i][j]= new Random().nextInt(100)+100;
            }
        }
    }
    public String toString(){
        String cadena="";
        for(int i=0; i<this.ventas.length;i++){
            for(int j=0;j<this.ventas[0].length;j++){
                cadena+= this.ventas[i][j]+" \t";
            }
            cadena+= "\n";
        }
        return  cadena;
    }
    public double ventaVendedor(int vendedor){
        double total=0;
        if(vendedor>0 && vendedor<= this.ventas[0].length) {
            for (int i = 0; i < this.ventas.length; i++) {
                total += ventas[i][vendedor];
            }
        }
        return total;
    }
    public double calcularVentasBimestral(int bimestre){
        double total=0;
        if(bimestre>=0 && bimestre<= this.ventas.length){
            for(int j=0;j<this.ventas[0].length;j++){
                total+= this.ventas[bimestre][j];
            }
        }
            return total;
    }
    public double ventaTotal(){
        double total=0;
        for(int i=0; i<this.ventas.length;i++){
            for(int j=0;j<this.ventas[0].length;j++){
                total+= this.ventas[i][j];
            }
        }
        return total;
    }

}

