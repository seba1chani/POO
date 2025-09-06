public class EmpleadoAdministrativo extends Empleado {
    private double comision;
    
    public EmpleadoAdministrativo(double comision){
        super();
        this.comision=comision;
    }
    public double getComision(){
        return this.comision;
    }
    @Override
    public boolean plus(double sueldoPlus) {
        if(comision<2000){
            setSalario(getSalario()+sueldoPlus);
            return true;
        }
        return false;
    }
    @Override
    public String imprimir() {
        return "Empleado Administrativo\n"+
           "Nombre y Apellido: " + getNombre() + "\n" +
           "Edad: " + getEdad() + "\n" +
           "Salario: " + getSalario() + "\n" +
           "Comisión: " + getComision();
    
    }
    
}
