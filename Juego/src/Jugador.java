public class Jugador {
    private double dinero;
    private double dineroApostado;

   public Jugador(double dinero){
       this.dinero=dinero;
   }
   public void setApuesta(double dineroApostado){
       this.dineroApostado= dineroApostado;
   }
   public double getApuesta(){
       return this.dineroApostado;
   }
   public void setDinero(double dinero){
       this.dinero=dinero;
   }
   public double getDinero(){
       return this.dinero;
   }

    public boolean puedeApostar(){
        return getDinero()>=getApuesta();
    }

    public boolean tieneDinero(){
       return this.dinero > 0;
    }
    public String toString(){
       return( "El jugador tiene: "+ getDinero()+ " apuesta: "+ getApuesta());
    }




}


