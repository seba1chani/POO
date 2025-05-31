public class PersonaUniversitaria {
    private int dni;
    private String nombreCompleto;
    protected boolean estado;

    public PersonaUniversitaria(int dni, String nombreCompleto){
        this.dni=dni;
        this.nombreCompleto=nombreCompleto;
        this.estado=false;
    }
    public int getDni(){
        return this.dni;
    }
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }

    public boolean getEstado() {
        return estado;
    }
    public String estadoRegular(){
        if(!getEstado()){
            return "No Regular";
        }
        return "regular";
    }


    public String toString(){
        String cadena="";
       return cadena=" Nombre Completo: "+ getNombreCompleto()
                +" DNI: "+getDni()+" Estado: "+ estadoRegular();
    }

}
