public class Main {
    public static void main(String[] args) {

        Tecnico tec1= new Tecnico();
        tec1.cargarCompetencia("Algo");
        System.out.println(tec1.cantidadDeCompetencias());
        System.out.println(tec1);
        tec1.cargarCompetencia("algo 2");
        System.out.println(tec1);
        tec1.eliminarCompetencia();
        System.out.println(tec1);
        tec1.eliminarCompetencia("casa");
        System.out.println(tec1);
        tec1.eliminarCompetencia("Algo");
        System.out.println(tec1);
        tec1.eliminarCompetencia();
        System.out.println(tec1);

    }
}