import java.util.*;
public class ejercicio5{

public static void main(String[] args) {
    int n1, siguiente;
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese un numero: ");
    n1 = scanner.nextInt();

    if (n1 > 0 ) {
        siguiente = n1 + 1;
        System.out.print("el numero siguente de " + n1 + " es " + siguiente );
    }
    else{
System.out.print("ingrese u numero positivo");
    }

}
}
