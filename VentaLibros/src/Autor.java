public class Autor {
    private String nombre;
    private String gooddreads;

    public Autor(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setGooddreads(String gooddreads){
        this.gooddreads= gooddreads;
    }
    public String getGooddreads(){
        return this.gooddreads;
    }
}
