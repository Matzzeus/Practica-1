import java.util.*;
public class ejercicio8{

public static void main(String[] args) {
    int n1, n2,n3;
    double pro;
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese un numero: ");
    n1 = scanner.nextInt();
    System.out.print("ingrese un numero: ");
    n2 = scanner.nextInt();
    System.out.print("ingrese un numero: ");
    n3 = scanner.nextInt();
    pro = ((n1 + n2 +n3)/3);
    System.out.print("le promedio de estos numeros " + n1 + " , " + n2 + " y " + n3 + " es  igual a " + pro );
}
}  