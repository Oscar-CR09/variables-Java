public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("EsNulo = " + esNulo);

        if(esNulo) {
           curso = "Progamacion Java";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("es vacio = " + esVacio);
        boolean esVacio2 = curso.isEmpty();
        System.out.println("es vacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("es blanco = "+ esBlanco);

        if (esBlanco == false) {

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }

        /*
           if (esVacio == false) {

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }*/
    }

}
