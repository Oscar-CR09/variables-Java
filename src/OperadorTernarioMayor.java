import java.util.Scanner;

public class OperadorTernarioMayor {
    public static void main(String[] args) {
        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = s.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 = s.nextInt();

        System.out.println("Ingrese un tercer  numero");
        int num3 = s.nextInt();

        System.out.println("Ingrese un cuarto  numero");
        int num4 = s.nextInt();

        max = (num > num2)? num:num2;
        max = (max > num3)?max:num3;
        max = (max > num4)?max:num4;

        System.out.println("numero1 = " + num);
        System.out.println("numero2 = " + num2);
        System.out.println("numero3 = " + num3);
        System.out.println("numero4 = " + num4);
        System.out.println("El numero mayor es: " + max);
    }
}
