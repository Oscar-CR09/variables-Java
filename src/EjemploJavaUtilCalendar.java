import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023,Calendar.FEBRUARY,17, 0,20,10);

        calendario.set(Calendar.YEAR,2023);
        calendario.set(Calendar.MONTH,Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH,17);

        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM,Calendar.PM);
        //calendario.set(Calendar.HOUR_OF_DAY,20);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);


        Date fecha =calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS a");
        String fechaConFormato = format.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);


    }
}
