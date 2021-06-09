import java.util.*;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.print("ingrese un numero: ");
        n1 = scanner.nextInt();
        if (n1 == 0 ){
            System.out.print("el valor ingresado es nulo " + n1);
        }  
        else if ( n1 > 0 ){
            System.out.print("el valor ingresado es positivo " + n1);
        }  
        
        else{
            System.out.print("el valor ingresado es negativo " + n1);
        }  
         
    }  

        }  
    