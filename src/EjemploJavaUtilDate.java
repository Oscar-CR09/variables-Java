import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("Fecha= " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MMMM-dd EEEE 'hora' HH:mm:ss z");

        String fechaStr = df.format(fecha);

        System.out.println("FechaSTR = " + fechaStr);

    }
}
