import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String nuemroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(nuemroStr);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero entero");
            main(args);
            System.exit(0);

        }

        String mensaje = "numero decimal de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
