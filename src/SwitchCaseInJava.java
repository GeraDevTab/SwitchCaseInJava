import java.util.Scanner;

public class SwitchCaseInJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int dia;
        dia = Integer.parseInt(entrada.nextLine());


        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            case 4:
                System.out.println("El día 4 es jueves");
                break;
            case 5:
                System.out.println("El día 5 es viernes");
                break;
            case 6:
                System.out.println("El día 6 es sabado");
                break;
            case 7:
                System.out.println("El día 7 es domingo");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }
    }
}
