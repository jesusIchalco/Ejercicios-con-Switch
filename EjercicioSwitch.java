import java.util.*;
public class EjercicioSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Elija la opcion 1, 2 o 3: ");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
