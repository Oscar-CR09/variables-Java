import java.util.Random;

public class EjemploClaseMath {
    public static void main(String[] args) {

        String[] colocres = {"azul","amarillo", "rojo" , "verde","negro"};

        double random = Math.random();
        System.out.println("random = " + random);

        random *=colocres.length;
        System.out.println("colores = " + colocres[(int) random]);
        System.out.println("Random" + random);
        random = Math.floor(random);
        System.out.println("random = " + random);

        Random randomObj = new Random();
        int randomInt  =  randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);


    }
}
