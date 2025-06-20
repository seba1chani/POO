

public class Surtidor {
    private int cargaMAX;
    private int ultraDiesel;
    private int euroDiesel;
    private int naftaSuper;
    private int naftaInfinia;

    public Surtidor(){
        cargaMAX= 20000;
        ultraDiesel=cargaMAX;
        euroDiesel= cargaMAX;
        naftaSuper= cargaMAX;
        naftaInfinia= cargaMAX;
    }
    public void llenarDepositoUDiesel(){
        this.ultraDiesel= cargaMAX;
    }
    public void llenarDepositoEDiesel(){
        this.euroDiesel= cargaMAX;
    }
    public void llenarDepositoNSuper(){
        this.naftaSuper= cargaMAX;
    }
    public void llenarDepositoInfinia(){
        this.naftaInfinia= cargaMAX;
    }
    public void cargarUDiesel(int litros){
        if(getCantUDiesel()==0){
            System.out.println("Surtidor vacio ");
        }
        if(getCantUDiesel()<litros){
            this.ultraDiesel=0;
        }else{
            this.ultraDiesel= getCantUDiesel()-litros;
        }
        
    }
    public void cargarEDiesel(int litros){

    }
    public void cargarNSuper(int litros){

    }
    public void cargarInfinia(int litros){

    }
    public int getCantUDiesel(){
        return this.ultraDiesel;
    }
    public int getCantEDiesel(){
        return this.euroDiesel;
    }
    public int getCantNSuper(){
        return this.naftaSuper;
    }
    public int getCantInfinia(){
        return this.naftaInfinia;
    }

}
