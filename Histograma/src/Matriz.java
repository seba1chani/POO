import java.util.Arrays;
import java.util.Random;

public class Matriz {
    private int [][]matriz;
    private int fila;
    private int columna;

    public Matriz(int n, int m){
        this.matriz= new int[fila][columna];
        this.fila = n;
        this.columna =m;
    }
    public int getFila(){
        return this.fila;
    }
    public int getColumna(){
        return this.columna;
    }
    public int getValor(int fil, int col){
        return matriz[fil][col];
    }
    public void cargarMatriz(){
        Random numRand= new Random();
        for(int fil=0;fil<matriz.length;fil++){
            for(int col=0;col<matriz[0].length;col++){
                matriz[fil][col]=numRand.nextInt(256);
            }
        }
    }
    public int[] crearHistograma(){
        int[]histograma= new int[256];
        int intensidad=0;
        for(int fil=0;fil< matriz.length;fil++){
            for(int col=0;col<matriz[0].length;col++){
                intensidad= getValor(fil,col);

                if(intensidad>=0 && intensidad<=255){
                    histograma[intensidad]++;
                }
            }

        }
        return histograma;
    }
    public double[] histogramaNomralizado( int[]histograma){
        double[]histogramaNomrmalizado= new double[256];
        int max=0;
        for(int valor: histograma ){
            if(valor>max){
                max=valor;
            }
        }
        if(max>0) {
            for (int i = 0; i < histogramaNomrmalizado.length; i++) {
                histogramaNomrmalizado[i] = histograma[i] / max;
            }
        }else
            System.out.println("error imagen vacia");

        return histogramaNomrmalizado;
    }

    public boolean soniguales(Matriz m){
        //verificar mismas dimensiones
        if(getFila()!=m.getFila() || getColumna()!=m.getColumna())
            return false;

        for(int fil=0;fil< matriz.length;fil++){
            for(int col=0;col<matriz[0].length;col++){
                if(getValor(fil,col)!=m.getValor(fil,col)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean esIgual(Matriz m){
        return Arrays.deepEquals(matriz,m.matriz);
    }



}
