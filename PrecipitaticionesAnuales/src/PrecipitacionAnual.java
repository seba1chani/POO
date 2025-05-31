public class PrecipitacionAnual {
    private double[] listaPrecipitaciones;
    private int indiceACargar;

    public PrecipitacionAnual(){
        this.listaPrecipitaciones= new double[12];
        this.indiceACargar=0;
    }
    public void cargarPrecipActual(double valor){

        listaPrecipitaciones[indiceACargar]=valor;
        indiceACargar++;
    }
    public void cargarPrecipMes(int indice,double valor){
        if(indice<indiceACargar){
            listaPrecipitaciones[indice-1]=valor;
        }


    }




}
