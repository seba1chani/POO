public class Alumno extends AbsStudent {
    public Alumno(String vnombre, char vsexo, long vdni, String facultad,
                  long lu, String carrera, int ingreso, int p1, int r1, int p2, int r2, int tpf){
                    super(vnombre, vsexo, vdni, facultad, lu, carrera, ingreso, p1, r1, p2, r2, tpf);
    }

    @Override
    boolean estaLibre() {
        return (((p1<60 )&& (r1<60))|| ((p2<60)&&(r2<60))||(tpf<60));
    }

    @Override
    boolean estaAusente() {
        return p1==0 && r1==0 && p2==0 && r2==0 && tpf==0;
    }

    @Override
    void showStudent() {
        System.out.println("Alumno: "+getNombre()+"LU: "+getLU());
    }
    
}
