public class primitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numero Byte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor ,maximo de un bytes a " + Byte.MAX_VALUE);
        System.out.println("valor ,minimo de un bytes a " + Byte.MIN_VALUE);

        short numeroShort = 32767;

        System.out.println("numero Short = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor ,maximo de un short a " + Short.MAX_VALUE);
        System.out.println("valor ,minimo de un short a " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numero int = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor ,maximo de un int a " + Integer.MAX_VALUE);
        System.out.println("valor ,minimo de un int a " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numero long = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor ,maximo de un long a " + Long.MAX_VALUE);
        System.out.println("valor ,minimo de un long a " + Long.MIN_VALUE);

        var numeroVar = 127;
    }
}
