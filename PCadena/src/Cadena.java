import java.util.ArrayList;
import java.util.List;

public class Cadena {
    String linea;
    ArrayList<Character> vocales = new ArrayList<>(List.of('a','e','i','o','u'));

   public int cantidadCaracteres(){
       return linea.length();
   }

   public int cantidadPalabras(){
       if(linea.isEmpty()){
           return 0;
       }
       else{
           String[] palabras = linea.split(" ");
           return palabras.length;
       }
   }
   public int contarVocales(){
       int cont=0;

       if(linea.isEmpty()){
           return 0;
       }
       else{
           for(char c : linea.toCharArray()){
                if(vocales.contains(c))
                    cont++;
           }

       }
       return cont;
   }

   public boolean esConsonante(char c){
       return Character.isLetter(c) && !vocales.contains(c);
   }

   public int contadorConsonantes(){
       int cont=0;

       if(linea.isEmpty())
           return 0;
       else{
           for(char c: linea.toCharArray()){
               if(esConsonante(c))
                   cont++;
           }
       }
       return cont;
   }




}