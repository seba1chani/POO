public class Main {
    public static void main(String[] args) {
        Operaciones mat= new Operaciones(4,6);
        mat.cargarAleatoriamente();
        System.out.println(mat);
        //mat.espejo();
        //System.out.println(mat);
        Matriz matriz;
            matriz= mat.maxpool(2);
            System.out.println(matriz);
    }
}