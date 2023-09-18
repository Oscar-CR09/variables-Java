import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("Fecha= " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MMMM-dd EEEE 'hora' HH:mm:ss z");

        String fechaStr = df.format(fecha);

        long j = 0 ;
        for (int i = 0 ; i<10000; i++)
        {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo trranscurrido en el for = " + tiempoFinal);
        System.out.println("FechaSTR = " + fechaStr);

    }
}
