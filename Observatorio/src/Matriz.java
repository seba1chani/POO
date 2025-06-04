import java.util.Random;

public class Matriz {
    private int[][] matriz;
    private int fila;
    private int columna;

    public Matriz(int n, int m) {
        this.matriz = new int[n][m];
        this.fila = n;
        this.columna = m;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getValor(int fila, int col) {
        return matriz[fila][col];
    }

    public void cargarMatriz() {
        Random rand = new Random();
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                matriz[i][j] = rand.nextInt(256);
            }
        }
    }

    public char[][] crearMapaEstrellas() {
        char[][] estrellas = new char[getFila()][getColumna()];
        for (int fil=1; fil<=getFila()-1;fil++){
            for(int col=1;col<=getColumna()-1;col++){
                if((getValor(fil,col)+getValor(fil-1,col)+
                        getValor(fil+1,col)+getValor(fil,col-1))<600){
                    estrellas[fil][col]='*';
                }else
                    estrellas[fil][col]=' ';

            }
        }

        return estrellas;
    }

    public String mostrarEstrellas(char[][]estrellas){
        String aux="";

        for(int i=0;i<getFila();i++){
            for(int j=0;j<getColumna();j++){
                aux+=estrellas[i][j];
            }
            aux+="\n";
        }
        return aux;
    }
}