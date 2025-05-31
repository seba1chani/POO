import java.util.ArrayList;

public class Libro {
    private int isbn;
    private ArrayList<Autor> autores;
    private Formato formato;
    private double precioNominal;

    public Libro(int isbn,ArrayList<Autor>autores,
                 Formato formato,double precioNominal){
        this.isbn=isbn;
        this.formato=formato;
        this.precioNominal=precioNominal;
        this.autores= autores;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public ArrayList<Autor> getAutores(){
        return new ArrayList<>(autores); // Copia independiente
    }
    public Formato getFormato(){
        return this.formato;
    }
    public double getPrecio(){
        if(formato instanceof Papel){
            if(getFormato().getTipo().equalsIgnoreCase( "tapa dura"))
                return this.precioNominal+precioNominal*0.20;
            else return this.precioNominal;
        }
        else if(formato instanceof Digital){
                if(getFormato().getTipo().equalsIgnoreCase("mobi"))
                    return this.precioNominal- this.precioNominal*0.05;
                else return this.precioNominal+this.precioNominal*0.15;

        }
        return this.precioNominal;
    }
    public boolean equals(Libro otro){
        return getIsbn()== otro.getIsbn();
    }


}
