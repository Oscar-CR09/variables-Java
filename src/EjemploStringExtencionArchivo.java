public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");
        //int i = archivo.lastIndexOf(".");
        System.out.println("archivos.length() = " + archivo.length());
        System.out.println("archivo = " +archivo.substring(i));

    }
}
