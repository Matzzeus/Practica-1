import java.util.*;
import java.math.*;

public class ejercicio7{

public static void main(String[] args) {
    int  rando;
    double n1;
    
     rando= (int) (Math.random()* 40 + 10);
     n1 = (rando * 0.15);
    System.out.print("el numero aleatorio es " + rando + " y con el descuento del 15% es: " + n1);
}
}