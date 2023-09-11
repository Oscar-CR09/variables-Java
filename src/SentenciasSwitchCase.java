public class SentenciasSwitchCase {
    public static void main(String[] args) {
         int num = 3;

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;

            case 1:
                System.out.println("El numero es uno");

                break;

            case 2:
                System.out.println("El numero es dos");
                break;

            case 3:
                System.out.println("El numero es tres");
                break;

            default:
                System.out.println("El numero no existe");
                break;

        }

        String nombre = "Oscar";
        switch (nombre){
            case "admin" :
                System.out.println("Hola Admin");
                break;
            case "Oscar":
                System.out.println("Hola Oscar");
                break;
            case "Pepe":
                System.out.println("Hola pepe");
                break;

            default:
                System.out.println("Usuario desconocido");
                break;

        }
    }
}
