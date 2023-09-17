public class PasarPorValor {
    public static void main(String[] args) {
        int  i = 10;
        System.out.println("se inicia el metodo main = " + i);

        test(i);

        System.out.println("Se finaliza con el valor i = " +  i );
    }

    public static void  test(int i){
        System.out.println("Iniciamos el metodo test con  i : " +i);
        i = 35;
        System.out.println("nuevo valor de i = " + i);

    }
}
