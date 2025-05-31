import java.util.Random;

public class Virus {
    private String nombre;
    private int adn;
    private boolean nocivo;

    public Virus(){
        this("Default");
    }

    public Virus(String nombre){
        Random numAleatorio= new Random();
        this.nombre=nombre;
        this.adn= numAleatorio.nextInt(((10-1)+1)+1);
        nocivo=true;
    }
    public boolean esNocivo(){
        return this.nocivo;
    }

    public void neutralizar(int adnNeutralizante){
        if(adnNeutralizante==this.adn) {
            this.nocivo = false;
        }

    }

    @Override
    public String toString() {
        return "Virus "+this.nombre;
    }
}
