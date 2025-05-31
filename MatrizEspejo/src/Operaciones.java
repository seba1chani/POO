public class Operaciones extends Matriz {
    public Operaciones(int m, int n) {
        super(m, n);
    }


    public void espejo() {
        for (int fil = 0; fil < getFilas(); fil++) {
            for (int col = 0; col < getColumnas() / 2; col++) {
                int colEspejo = getColumnas() - 1 - col;
                char aux = getValor(fil, colEspejo);
                setValor(fil, colEspejo, getValor(fil, col));
                setValor(fil, col, aux);
            }
        }
    }
    public boolean esMultiplo(int n){
        return getFilas()%n==0 && getColumnas()%n==0;
    }
    public char buscarMayor(int n,int fil, int col){
        int mayor=getValor(fil,col);

        for(int i=fil;i<fil+n;i++){
            for(int j=col;j<col+n;j++){
                if(mayor<getValor(i,j)){
                    mayor=getValor(i,j);
                }
            }
        }
        return (char)mayor;
    }
    public Matriz maxpool(int n){
        Matriz matriz=new Matriz(getFilas()/n,getColumnas()/n);
        int cMax,fMax=0;
        if(esMultiplo(n)){
            for(int fil=0; fil<getFilas(); fil=fil+n){
                cMax=0;
                for(int col=0; col<getColumnas(); col=col+n){
                    matriz.setValor(fMax,cMax,buscarMayor(n,fil,col));
                    cMax++;
                }
                fMax++;
            }
        }else
            System.out.println(" No se puede aplicar");

        return matriz;
    }

}
