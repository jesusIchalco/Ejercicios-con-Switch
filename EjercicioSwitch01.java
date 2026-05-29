import java.util.*;
public class EjercicioSwitch01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Elija una Opcion:");
        System.out.println("1.Registrar");
        System.out.println("2.Buscar");
        System.out.println("3.Eliminar");
        System.out.println("4.Salir");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dije 1 al 7 CIEGO!!!");
                break;
        }
    }
}