import java.util.Scanner;

public class OperadoresLogicoslogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];  //prmera forma de arreglos
        String[] passwords = new String[3];
        usernames [0] = "oscar";
        passwords[0] = "12345";

        usernames [1] = "admin";
        passwords [1] = "1234";

        usernames [2]= "pepe";
        passwords [2] = "123";*/

        String[] usernames = {"oscar", "admin", "pepe"};
        String[] passwords = { "12345", "1234","123" };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
         String u = scanner.nextLine();

        System.out.println("Ingrese el password");
         String p = scanner.nextLine();

         boolean esAutenticado = false;

         for(int i=0 ; i< usernames.length; i++){
             if (  (usernames[i].equals(u) &&  passwords[i].equals(p)) ){

                 esAutenticado = true;
                 break;
             }
         }
         if (esAutenticado ){
             System.out.println("Bienvenido usuario ".concat(u).concat("!"));
         }else {
             System.out.println("Username o contraseña incorrecta");
             System.out.println("Lo siento, requiere una autenticacion");
         }

    }
}
