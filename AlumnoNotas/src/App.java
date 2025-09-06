public class App {
    public static void main(String[] args) throws Exception {
        ListaAlumno lista= new ListaAlumno();
        lista.agregarAlumno(new Alumno("Juan", 'M', 12345678, "Informatica", 1001, "Sistemas", 2022, 70, 0, 80, 0, 90));
        lista.agregarAlumno(new Alumno("Ana", 'F', 87654321, "Informatica", 1002, "Sistemas", 2022, 0, 0, 0, 0, 0));
        lista.agregarAlumno(new Alumno("Luis", 'M', 11223344, "Informatica", 1003, "Sistemas", 2022, 50, 50, 40, 40, 50));

        System.out.println("Regulares: "+ lista.contarRegulares());
        System.out.println("Ausentes: "+ lista.contarAusentes());
        System.out.println("Libres: "+lista.contarLibres());
    }
}
