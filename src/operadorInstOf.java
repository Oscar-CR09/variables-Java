public class operadorInstOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String .. que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof  Object;

        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof  String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es el tipo de Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es el tipo de Number = " + b1);

        b1 = num instanceof Object; // object es el padre de los objetos
        System.out.println("num es el tipo de Object = " + b1);

        Double decimal = 45.5;
        b1 = decimal instanceof Number; // object es el padre de los objetos
        System.out.println("decimal es el tipo de NUmber = " + b1);

        decimal = 45.5;
        b1 = decimal instanceof Object; // object es el padre de los objetos
        System.out.println("decimal es el tipo de Object = " + b1);
    }
}
