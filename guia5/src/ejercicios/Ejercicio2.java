//2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {

    
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese su nombre");
        nombre= read.nextLine();
        System.out.println("el nombre es: " + nombre);
    }
    
}
