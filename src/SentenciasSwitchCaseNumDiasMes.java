import java.util.Scanner;

public class SentenciasSwitchCaseNumDiasMes {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        System.out.println("Ingrese el numero del mes de 1-12");
        int mes = s.nextInt();

        int numerosDias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numerosDias = 31;
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11:
                numerosDias = 30;
                break;

            case 2:
                if (mes == 1 || mes ==3 || mes ==5 || mes ==7 || mes ==8|| mes==10|| mes==12){
                    numerosDias= 31;

                } else if (mes == 4|| mes == 6||mes==9||mes == 11) {
                    numerosDias=30;
                }else if (mes == 2){
                    if (anio % 400 ==0 ||((anio%4==0)&&!(anio% 100 == 0))){
                        numerosDias =29;
                    }else {
                        numerosDias = 28;
                    }
                }
                break;

            default:
                numerosDias = 0;
                break;

        }
       /* if (mes == 1 || mes ==3 || mes ==5 || mes ==7 || mes ==8|| mes==10|| mes==12){
            numerosDias= 31;

        } else if (mes == 4|| mes == 6||mes==9||mes == 11) {
            numerosDias=30;
        }else if (mes == 2){
            if (anio % 400 ==0 ||((anio%4==0)&&!(anio% 100 == 0))){
                numerosDias =29;
            }else {
                numerosDias = 28;
            }
        }*/
        System.out.println("numerosDias = " + numerosDias);
    }
}
