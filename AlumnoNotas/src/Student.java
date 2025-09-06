public class Student extends Person{
    long LU;
    String facultad;
    String carrera;
    int anioIngreso;

    public Student(String vnombre,char vsexo,long vdni,String facultad
        ,long lu,String carrera,int ingreso){
            super(vnombre, vsexo, vdni);
            this.LU=lu;
            this.facultad= facultad;
            this.carrera= carrera;
            this.anioIngreso= ingreso;
    }
    public long getLU(){
        return this.LU;
    }
}
