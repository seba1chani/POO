import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDateTime fecha;

    public Fecha(){
        this.fecha= LocalDateTime.now();
    }
    public Fecha(int dia,int mes,int anio, int hora, int min){
        this.fecha= LocalDateTime.of(anio,mes,dia,hora,min);
    }
    public int getanio(){
        return this.fecha.getYear();
    }
    public void setanio(int anio){
        this.fecha= this.fecha.withYear(anio);
    }
    public int getmes(){
        return this.fecha.getMonthValue();
    }
    public void setMes(int mes){
        this.fecha= this.fecha.withMonth(mes);
    }
    public int getDia(){
        return this.fecha.getDayOfMonth();
    }
    public void setDia(int dia){
        this.fecha= this.fecha.withDayOfMonth(dia);
    }
    public int getHora(){
        return this.fecha.getHour();
    }
    public void setHora(int hora){
        this.fecha=this.fecha.withHour(hora);
    }
    public int getMin(){
        return this.fecha.getMinute();
    }
    public void setMin(int min){
        this.fecha= this.fecha.withMinute(min);
    }

    public String toString(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm");
        return this.fecha.format(formato);
    }
}
