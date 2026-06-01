import java.util.*;
public class EjercicioSwitch04ACT {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int saldo = 1000;
        int opcion = 0;
        while (opcion !=4) {
            System.out.println("<<<Bienvenido al cajero>>>");
            System.out.println("Seleccione las siguientes opciones");
            System.out.println("1.Consultar Saldo");
            System.out.println("2.Depositar");
            System.out.println("3.Retirar");
            System.out.println("4.Salir");
            opcion=s.nextInt(); //esto esta aqui porque fuera se repite en bucle
            switch (opcion) {
            case 1:
                System.out.println("Su saldo es: "+saldo);
                break;
            case 2:
                System.out.println("Ingrese Cantidad a Depositar");
                int dep = s.nextInt();
                saldo = saldo + dep;
                System.out.println("Saldo Disponible "+ saldo);
                break;
            case 3:
                System.out.println("Ingrese Cantidad a Retirar");
                int ret = s.nextInt();
                saldo = saldo - ret;
                System.out.println("Saldo Disponible "+ saldo);
                break;
            case 4:
                System.out.println("Tenga un buen dia");
                break;
            }
        }
    }
}
