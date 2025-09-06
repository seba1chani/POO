public class EmpleadoComercial extends Empleado{
    private double comision;
    
    public EmpleadoComercial(double comision){
        super();
        this.comision=comision;
    }
    public double getComision(){
        return this.comision;
    }
    @Override
    public boolean plus(double sueldoPlus) {
        if(comision<1000){
            setSalario(getSalario()+sueldoPlus);
            return true;
        }
        return false;
    }
    @Override
    public String imprimir() {
        return "Empleado Comercial\n"+
           "Nombre y Apellido: " + getNombre() + "\n" +
           "Edad: " + getEdad() + "\n" +
           "Salario: " + getSalario() + "\n" +
           "Comisión: " + getComision();

    }

}
