public class PrimitivosCaracteres {

    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter" + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';//'\u0020'
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornCarro = '\r';


        System.out.println("char correspondiente en byte:"+ espacio + Character.BYTES);
        System.out.println("char corresponde en bites a = "+ Character.SIZE);
        System.out.println("maximo valor para char = "+ Character.MAX_VALUE);
        System.out.println("minimo valor para char  = "+ Character.MIN_VALUE);
    }

}
