import java.util.Scanner;

public class OperadoresLogicoslogin {
    public static void main(String[] args) {
        String username = "oscar";
        String password = "12345";

        String username2 = "admin";
        String password2 = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
         String u = scanner.nextLine();

        System.out.println("Ingrese el password");
         String p = scanner.nextLine();

         boolean esAutenticado = false;

         if (  (username.equals(u) &&  password.equals(p)) ||
                 (username2.equals(u) &&  password2.equals(p))){

             esAutenticado = true;
         }else {
             System.out.println("Username o contraseña incorrecta");
         }
         if (esAutenticado ){
             System.out.println("Bienvenido usuario ".concat(u).concat("!"));
         }else {
             System.out.println("Lo siento, requiere una autenticacion");
         }
    }
}