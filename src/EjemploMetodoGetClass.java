import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "holaque tal! ";

        Class strClass =  texto.getClass();

        System.out.println("strClass.getName() = " +strClass.getName());
        System.out.println("strClass.getName() = " +strClass.getSimpleName());
        System.out.println("strClass.getName() = " +strClass.getPackageName());
        System.out.println("strClass.getName() = " +strClass);

        for (Method metodo : strClass.getMethods()) {
            System.out.println("Metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class  intClass = num.getClass();
        Class objeClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass.getName().superClass  = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass.getName().superClass  = " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: objeClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
