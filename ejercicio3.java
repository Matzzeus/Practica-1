import java.util.*;
public class ejercicio3{

public static void main(String[] args) {
    int n1, n2, doble1, doble2, triple1, triple2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese un numero: ");
    n1 = scanner.nextInt();
    System.out.print("ingrese un numero: ");
    n2 = scanner.nextInt();
doble1 = n1 * 2;
triple1 = n1 * 3;
doble2 = n2 * 2;
triple2 = n2 * 3;
 System.out.print("el doble del primer numero es " + doble1);
 System.out.println("");
 System.out.print("el triple del primer numero es " + triple1);
 System.out.println("");
 System.out.print("el doble del segundo numero es: " + doble2);
 System.out.println("");
 System.out.print("el triple del segundo numero es: " + triple2);


        
    }
}