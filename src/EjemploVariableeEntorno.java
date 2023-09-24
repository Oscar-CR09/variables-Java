import javax.sound.midi.Soundbank;
import java.util.Map;

public class EjemploVariableeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente delssitema = "  + varEnv);

        String username =System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome =System.getenv("JAVA_HOME");
        System.out.println("javaHome = " +javaHome);

        String tenDir =System.getenv("TEMP");
        System.out.println("tenDir = " + tenDir);

        String path =System.getenv("Path");
        System.out.println("path = " + path);

        String path2 =varEnv.get("Path");
        System.out.println("path2 = " + path2);

    }
}
