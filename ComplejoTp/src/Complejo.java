public class Complejo {
    double real;
    double imaginario;

    public Complejo(double real,double imaginario){
        this.real=real;
        this.imaginario= imaginario;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
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
