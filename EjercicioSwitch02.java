import java.util.*;
public class EjercicioSwitch02 {
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
                System.out.println("Usted se esta Registrando");
                break;
            case 2:
                System.out.println("Usted esta Buscando");
                break;
            case 3:
                System.out.println("Usted esta eliminando");
                break;
            case 4:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}