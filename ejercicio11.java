import java.util.*;
public class ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, yar, m, pie, pul;
        System.out.print("ingrese una medida en cm: ");
        n1 = scanner.nextInt();
        yar = n1 / 91.44;
        m = n1 / 100;
        pie = n1 / 30.48;
        pul = n1 / 2.54;
        System.out.print("la unidad que ingro en CM es igua a: " + yar +" yardas");
        System.out.println(" ");
        System.out.print("la unidad que ingro en CM es igua a: " + m + "metros");
        System.out.println(" ");
        System.out.print("la unidad que ingro en CM es igua a: " + pie + " pies");
        System.out.println(" ");
        System.out.print("la unidad que ingro en CM es igua a: " + pul + " pulgadas");
        
        



    }
}