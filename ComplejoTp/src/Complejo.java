public class Complejo {
    double real;
    double imaginario;

    public void suma( Complejo c1, Complejo c2){

        real= c1.real + c2.real;
        imaginario= c1.imaginario+ c2.imaginario;
    }
    public void resta( Complejo c1, Complejo c2){
        real= c1.real - c2.real;
        imaginario= c1.imaginario - c2.imaginario;
    }
    public void multiplicar(Complejo c1,Complejo c2){
        real= (c1.real*c2.real)-(c1.imaginario*c2.imaginario);
        imaginario= (c1.real*c2.imaginario)+(c1.imaginario*c2.real);
    }


    @Override
    public String toString() {
        if(imaginario >0){
            return real + "+" + imaginario+"i";
        }else
            return real+ "" + imaginario+"i";
    }
}
