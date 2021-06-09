import java.util.*;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r, h , v;
        System.out.print("ingrese un radio de circulo: ");
        r = scanner.nextInt();
        System.out.print("ingrese una altura: ");
        h = scanner.nextInt();

        if (r > 0 && h > 0){
            v =( Math.PI * (r*r) * h);
            System.out.print("el volumen del cilindro es igual a: " + v +" unidades cubicas");
        }
        else
        {
            System.out.print("ingrese numeros positivos: ");
        }

        
    }

}
