
import java.util.ArrayList;

public abstract  class ListaOrdenada {
    private ArrayList<Object>lista;

    public ListaOrdenada(){
        this.lista= new ArrayList<>();
    }
    public int getTam(){
        return lista.size();
    }
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    public abstract boolean menor(Object objA,Object objB);
    public abstract boolean mayor(Object objA,Object objB);
    public abstract boolean igual(Object objA, Object objB);

    public int posicionDe(Object obj){
        return busquedaBinaria(obj);
    }
    public void insertar(Object obj){
        int i=0;
        while(i<lista.size() && menor(lista.get(i),obj)){
            i++;
        }    
        lista.add(i,obj);
    }
    public void eliminar(Object obj){
        int indice= busquedaBinaria(obj);
        if(indice!=-1){
            lista.remove(indice);
        }
    }
    public int busquedaBinaria(Object obj){
        int inicio=0;
        int fin= lista.size();

        while(inicio<=fin){
            int medio= inicio+(fin-inicio)/2;
            Object elementoMedio= lista.get(medio);
            
            if(igual(elementoMedio,obj)){
                return medio;
            }else if(menor(elementoMedio, obj)){
                inicio=medio;
            }else{
                fin=medio-1;
            }

        }
        return -1;
    }
    public boolean esta(Object obj){
        return busquedaBinaria(obj)!=-1;
    }

    public String toString(){
      String aux="";
      for(int i=0; i<lista.size();i++){
        aux+= lista.get(i);
      }
      return aux; 
    }



}
