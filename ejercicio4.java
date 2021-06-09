import java.util.*;
public class ejercicio4{

public static void main(String[] args) {
    int n1, cubo, cuadrado;
    Scanner scanner = new Scanner(System.in);
    System.out.print("ingrese un numero: ");
    n1 = scanner.nextInt();

    cuadrado = n1*n1;
    cubo = n1* n1 * n1;

     System.out.print("el cuadrado de " + n1 + " es " + cuadrado);
     System.out.println("");
     System.out.print("el cubo de " + n1 + " es " + cubo);
    }
}