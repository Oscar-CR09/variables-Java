class Persona{
    private String nombre;

    public void modificarNombre(String nuevonombre){
        this.nombre = nuevonombre;

    }

    public String leerNombre(){
        return  this.nombre;
    }
}
public class PasarReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Oscar");
        System.out.println("iniciamos el metodo main");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Después de llamar el método test");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Se finaliza el metodo main de la persona modificado " );
    }

    public static void  test(Persona persona){

        System.out.println("Iniciamos el metodo test" );
        persona.modificarNombre("Andres");
        System.out.println("Se  finaliza el método test" );

    }
}
