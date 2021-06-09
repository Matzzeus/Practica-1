import java.util.*;
import java.math.*;

public class ejercicio6{

public static void main(String[] args) {
    int  rand;
    double n1;
    
     rand= (int) (Math.random()* 200 + 1);
     n1 = (rand * 0.30) + rand;
    System.out.print("el numero aleatorio es " + rand + " y con el aumento del 30% es: " + n1);
}
}


