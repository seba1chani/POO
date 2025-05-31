public class Auto {
    private String matricula;
    private String marca;
    private String modelo;

    public Auto(String matricula,String marca,String modelo ){
        this.modelo= modelo;
        this.marca= marca;
        this.matricula= matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String toString(){
        return "Matricula: "+getMatricula()+" "+" Marca: "+getMarca()+" "
                +" Modelo: "+getModelo();
    }

}
