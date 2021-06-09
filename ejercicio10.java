import java.util.*;
public class ejercicio10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h, b, area, peri;
    System.out.print("ingrese una altura rectangulo: ");
    h = scanner.nextInt();
    System.out.print("ingrese una base de rectangulo : ");
    b = scanner.nextInt();
    
    if (h >0 && b > 0) {
        area = b * h;
        peri = 2*b + 2*h;
        System.out.print("el area del rectangulo es: " + area +" unidades cuadradas");
        System.out.println(" ");
        System.out.print("el perimetro del recatnauglo es: " + peri + "unidades");

    }
    else
    {
System.out.print("ingrese datos positivos");
    }



}
}