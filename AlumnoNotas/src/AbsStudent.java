public abstract class AbsStudent extends Student {
    int p1,r1,p2,r2,tpf;

    public AbsStudent(String vnombre,char vsexo,long vdni,String facultad
        ,long lu,String carrera,int ingreso,int p1,int r1,int p2,int r2,int tpf){
            super(vnombre, vsexo, vdni, facultad, lu, carrera, ingreso);
            this.p1=p1;
            this.p2=p2;
            this.r1=r1;
            this.r2=r2;
            this.tpf=tpf;
    }
    public boolean estaRegular(){
        boolean rta= false;
        if(((p1>=60)||(r1>=60))&& ((p2>=60)||(r2>=60))&&(tpf>=60)){
            rta=true;
        }
        return rta;
    }
    abstract boolean estaLibre();
    abstract boolean estaAusente();
    abstract void showStudent();
}
