import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        /*
        LocalDate fecha;
        LocalTime horas;

        LocalDateTime fechaYHora, fechaEspecial;
        fechaYHora = LocalDateTime.now();
        fechaEspecial= LocalDateTime.of(2018,12,9,16,32);
        System.out.println(fechaYHora);
        System.out.println(fechaEspecial);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("\"'Fecha: 'dd/MM/yyyy' y hora: ' HH:mm \"");
        // mm= minutos | MM=mes | hh f12hs | HH f24hs || am o pm
        System.out.println(fechaEspecial.format(formato));
        System.out.println(ChronoUnit.YEARS.between(fechaEspecial,fechaYHora));
         */
        Fecha fecha = new Fecha();
        System.out.println(fecha);
    }
}