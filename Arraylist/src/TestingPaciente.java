import java.util.ArrayList;

public class TestingPaciente {
    public static void main(String[] args) {
        ArrayList<Paciente>listado = new ArrayList<Paciente>();
        Paciente p1 = new Paciente(111,"pancho");
        Paciente p2 = new Paciente(222,"pancho");
        Paciente p3= new Paciente(333,"pepe");
        listado.add(p1);
        listado.add(p2);
        System.out.println(listado);
        System.out.println(listado.indexOf(p3));
    }
}
