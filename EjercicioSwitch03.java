import java.util.*;
public class EjercicioSwitch03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("<<<Calculadora>>>");
        System.out.println("Ingrese Numero 1");
        int n1 = s.nextInt();
        System.out.println("Ingrese Numero 2");
        int n2 = s.nextInt();
        System.out.println("Seleccione una operacion");
        System.out.println("1.Suma +");
        System.out.println("2.Resta -");
        System.out.println("3.Multiplicacion *");
        System.out.println("4.Division /");
        int total=0;
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                total = n1+n2;
                System.out.println("La suma de "+n1+" y "+n2+" es: "+total);
                break;
            case 2:
                total = n1-n2;
                System.out.println("La resta de "+n1+" y "+n2+" es: "+total);
                break;
            case 3:
                total = n1*n2;
                System.out.println("La multiplicacion de "+n1+" y "+n2+" es: "+total);
                break;
            case 4:
                if (n2==0){
                System.out.println("Error: No se puede dividir entre cero.");
                }
                else{
                total = n1 / n2;
                System.out.println("La division de "+n1+" y "+n2+" es: "+total);
                }
                break;
            default:
                System.out.println("Opcion invalida ERROR");
                break;
        }
    }
}
