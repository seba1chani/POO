import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fecha {
    private LocalDateTime fecha;
    public Fecha(){
        this.fecha= LocalDateTime.now();
    }
    public Fecha(int dia, int mes,int anio,int hora,int min){
        this.fecha= LocalDateTime.of(anio,mes,dia,hora,min);
    }
    public int getanio(){
        return this.fecha.getYear();
    }
    public int getmes(){
        return this.fecha.getMonthValue();
    }
    //DateTimeFormatter formato = DateTimeFormatter.ofPattern(" dd/MM/yyyy ");
    public int diferenciaAnios(){
        return (int) ChronoUnit.YEARS.between(fecha,LocalDateTime.now());
    }

}
