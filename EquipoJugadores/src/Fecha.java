import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDateTime fecha;
    public Fecha(){
        this.fecha= LocalDateTime.now();
    }
    public Fecha(int dia,int mes,int anio,int hora,int min){
        this.fecha= LocalDateTime.of(anio,mes,dia,hora,min);
    }

    public String toString(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fecha.format(formato);
    }
}
