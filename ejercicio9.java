import java.util.*;
public class ejercicio9 {
 public static void main(String[] args) {
String p1, p2, p3;
Scanner scanner = new Scanner(System.in);
System.out.print("ingrese una palabra: ");
p1 = scanner.nextLine();
System.out.print("ingrese una palabra: ");
p2 = scanner.nextLine();

p3 = p1;
p1 = p2;
p2 = p3;

System.out.print("las palabras ingresada ordenadas al revez es igual: " + p1 +" "+ p2);

}
}