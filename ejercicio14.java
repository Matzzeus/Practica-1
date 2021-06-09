import java.util.*;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, div;
        
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        System.out.print("ingrese un numero: ");
        n2 = scanner.nextInt();
        if (  n2 != 0  ){
            div = n1 / n2;
            if ( div > 0 ){

                System.out.print("el primer numero es divisible");

            }  
            else {

                System.out.print("el primer numero no es divisible con el segundo numero");

            }  
            

        }        
        else
        {
            System.out.print("no es posible");


        }  
    }

}
