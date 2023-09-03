
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String nuemroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(nuemroStr);

        }catch (Exception e){
            System.out.println("Error, Debe ingresar un numero entero");
            main(args);
            System.exit(0);

        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensaje);
    }
}
