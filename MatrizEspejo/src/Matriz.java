import java.util.Random;

public class Matriz {
    private char[][]matriz;
    private int filas,columnas;

    public Matriz(int m,int n){
        this.matriz= new char[m][n];
        this.filas=m;
        this.columnas=n;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setValor(int x,int y,char valor){
        if(x>=0&& x<getFilas() && y>=0 && y<getColumnas()){
            this.matriz[x][y]=valor;
        }
    }
    public char getValor(int x, int y){
        char valor=' ';
        if(x>=0&& x<getFilas() && y>=0 && y<getColumnas()){
            valor= this.matriz[x][y];
        }else{
            System.out.println("error. fuera de rango");
        }
        return valor;
    }
    public void cargarAleatoriamente() {
        Random rand = new Random();
        char min = 'a';
        char max = 'z';
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (char) (rand.nextInt((max - min) + 1) + min);
            }
        }
    }
    public String toString(){
        String aux="";
        for(int i=0;i<getFilas();i++){
            for(int j=0;j<getColumnas();j++){
                aux+=getValor(i,j);
            }
            aux+="\n";
        }
        return aux;
    }

}
