public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String nombre = "Oscar Cervantes";

        String resultado = curso.concat(nombre);
        System.out.println("curso = " + curso );
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform((c) ->{
          return c + " con " + nombre;

        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a" , "A" + resultado );

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

    }

}
