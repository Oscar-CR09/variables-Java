public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intobjeto = Integer.valueOf(32768);
        Integer intobjeto2 = 32768;
        System.out.println("intObjeto = " + intobjeto);

        int num = intobjeto;
        System.out.println("num = " + num);
        int num2= intobjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvlcd = "6700";

        Integer valor = Integer.valueOf(valorTvlcd);
        System.out.println("valor = " +valor);

        Short shortObjeto = 32767;
    }
}
