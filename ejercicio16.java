import java.util.*;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        System.out.print("ingrese un numero: ");
        n2 = scanner.nextInt();
        System.out.print("ingrese un numero: ");
        n3 = scanner.nextInt();

        if ( n1 > n2 && n1 > n3 ){
            System.out.print("el numero mayor es : " + n1);
        }
        else if ( n2 > n1 && n2 > n3 ){
            System.out.print("el numero mayor es : " + n2);
        }
        else {
            System.out.print("el numero mayor es : " + n3);
        }
    }  

}