//5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
//el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
         double raiz;
            System.out.println("ingrese un numero");
            num= read.nextInt();
            System.out.println("el doble del numero es: " + (num*2));
            System.out.println("el triple del numero es: " + (num*3));
            System.out.println("la raiz del numero es: " + (Math.sqrt(num)));
    }
    
}
