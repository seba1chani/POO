public class Auto {
    private Motor motor;
    private Tanque tanque;
    private double distanciaRecorrida;

    public Auto(Motor motor,Tanque tanque,double distanciaRecorrida){
        this.motor=motor;
        this.tanque=tanque;
        this.distanciaRecorrida=distanciaRecorrida;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
    public double calcularDistancia(double consumo){
        double distancia= consumo * motor.getDistanciaXLitro();
        return distancia;
    }
    public boolean puedeMoverse(){
        return motor.getConsumoXMin()<=tanque.getCapActual();
    }

    public void mover(){
        if(!tanque.isVacio()&& motor.isEncendido()&& puedeMoverse()){
            double consumoxmin= motor.getConsumoXMin();
            tanque.consumirNafta(consumoxmin);

            if(tanque.getCapActual()== 0){
                motor.setEncendido(false);
                System.out.println("Sin Combustible");
            }
            if(tanque.getCapActual()>0){
                
            }

        }


    }
}
