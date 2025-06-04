public class ListaDeAlumnos extends ListaOrdenada {

    public boolean menor(Object objA,Object objB){
        return (Alumno)objA<(Alumno)objB;
    }
    public boolean igual(Object objA,Object objB){
        return (Alumno)objA==(Alumno)objB;
    }
    public boolean mayor(Object objA,Object objB){
        return (Alumno)objA>(Alumno)objB;
    }
}
