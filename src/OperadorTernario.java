import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable= 7 ==7 ? "si es verdadero": "falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2.0 y 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de las ciencias entre 2.0 y 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de las historia entre 2.0 y 7.0");
        historia = s.nextDouble();

        promedio= (matematicas + ciencias+historia)/3;
        System.out.println("promedio = " +promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "reprobado";
        System.out.println("estado = "  + estado);


    }
}
