public class ConvercionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numero = " + numeroInt);

        String realStr = "9857.89";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = "+ realDouble);

        String logicosStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicosStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


    }
}
