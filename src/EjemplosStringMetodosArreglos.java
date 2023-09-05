public class EjemplosStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas .toChartArray = " +trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i< largo; i++){
            System.out.println("i = " + arreglo[i]);

        }
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;

        for (int j = 0 ; j<l ; j++){
            System.out.println(arreglo2[j]);
        }


    }
}
