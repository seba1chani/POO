public class App {
    public static void main(String[] args) throws Exception {
        EmpleadoAdministrativo admins= new EmpleadoAdministrativo(4000);
        admins.setNombre("Juan Garnizo");
        admins.setEdad(28);
        admins.plus(2000);
        System.out.println(admins.imprimir());
    }
}
