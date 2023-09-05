public class EjemplosStringMetodos {
    public static void main(String[] args) {
        String nombre = "oscar";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowercase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(oscar)" + nombre.equals("oscar"));
        System.out.println("nombre.equalsIgnorecase" + nombre.equalsIgnoreCase("oscar"));
        System.out.println("nombre.cmpareto"+ nombre.compareTo("oscar"));
        System.out.println("nombre.compareTo"+ nombre.compareTo("Andres"));
        System.out.println("nombre.charAt = " + nombre.charAt(0));
        System.out.println("nombre.charAt = " + nombre.charAt(1));
        System.out.println("nombre.charAT(nombreLength()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,5));
        System.out.println("nombre.substring(5) = " + nombre.substring(nombre.length()-1));
        String trabalengua = "trabalenguas";

        System.out.println("trabalenguas = " +trabalengua.replace("a","."));
        System.out.println("trabalenguas = " +trabalengua);
        System.out.println("trabalenguas.index('a')" + trabalengua.indexOf('a'));
        System.out.println("trabalenguas.lastindexof('a' = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z')=" +trabalengua.indexOf('z'));
        System.out.println("trabalenguas.contains('t') = " + trabalengua.contains("t"));
        System.out.println("trabalenguas.starstWith('tr') = " + trabalengua.startsWith("tr"));
        System.out.println("trabalenguas.endstWith('as') = " + trabalengua.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());


    }
}
