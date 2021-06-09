import java.util.*;
public class ejercicio2{

public static void main(String[] args) {
    String n1, n2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese una capital de cualquier país: ");
    n1 = scanner.nextLine();
    System.out.print("ingrese el nombre del país, de la capital antes escrita: ");
    n2 = scanner.nextLine();

        System.out.println(n1 + " es la capital de " + n2);
       
    }
}