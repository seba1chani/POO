import java.util.Random;

public class Tablero {
    private int tablero[][];
    private int token;

    public Tablero(){
        this.tablero= new int[3][3];
        this.token=0;
    }
    public int getToken() {
        return token;
    }
    public void setToken(int token) {
        this.token = token;
    }

    public void cargarTablero(){
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                this.tablero[i][j]=0;
            }
        }
    }
    public boolean estaVacio(){
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                if(tablero[i][j]==0)
                    return true;
            }
        }
        return false;
    }
    public boolean puedeJugar(int fila,int col){
        return this.tablero[fila][col]==0 && fila>=0 && fila<3 && col>=0 && col<3;
    }
    public void setJugada(int fila,int col,int token){
        if (puedeJugar(fila,col)){
            this.tablero[fila][col]=token;
        }else {
            System.out.println( "posicion invalida");
        }
    }
    public void juegoPc(){
        Random ran= new Random();
        int fil, col;
        do{
            fil=ran.nextInt(3);
            col=ran.nextInt(3);
        }while(!puedeJugar(fil,col));
        if(getToken()==1)
            setJugada(fil,col,-1);
        else
            setJugada(fil,col,1);
    }

    public void juegoJugador(int fila,int col){
        setJugada(fila,col,getToken());
    }

    // contadores para el tablero
    public int contarFil(int fila){
        int total=0;
        for(int i=0; i<3;i++){
            total+=this.tablero[fila][i];
        }
        return total;
    }
    public int contarCol(int col){
        int total=0;
        for(int i=0; i<3;i++){
            total+=this.tablero[i][col];
        }
        return total;
    }
    public int contarDiagonal(){
        int total=0;
        for(int i=0; i<3;i++){
            total+=this.tablero[i][i];
        }
        return total;
    }
    public int contarDiagonal2(){
        int total=0;
        for(int i=0; i<3;i++){
            total+=this.tablero[i][2-i];
        }
        return total;
    }
    //fin de los contadores
    public int obtenerLineaGanadora(int valorLinea){
        if(valorLinea == 3)
            return 1;
         else if (valorLinea==-3)
            return -1;

        return 0;
    }

    boolean enDiagonal(int fil, int col){
        return (fil==col)||(fil+col==2);
    }
    public int obtenerGanador(int fil,int col){
        int ganador= obtenerLineaGanadora(contarFil(fil));
        if(ganador!=0)
            return ganador;

        ganador= obtenerLineaGanadora(contarCol(col));
        if(ganador!=0)
            return ganador;

        if(enDiagonal(fil,col)){
            ganador= obtenerLineaGanadora(contarDiagonal());
            if(ganador!=0)
                return ganador;
            ganador= obtenerLineaGanadora(contarDiagonal2());
            if(ganador!=0)
                return ganador;
        }
        return 0;
    }

    public String toString(){
        String cadena="";
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                cadena+=this.tablero[i][j]+"\t";
            }
            cadena+="\n";
        }
        return cadena;
    }

}
