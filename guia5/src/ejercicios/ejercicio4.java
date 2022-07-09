//4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package ejercicios;

import java.util.Scanner;
public class ejercicio4 {

   
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      double gradosC ,gradosf;
        System.out.println("ingrese los grados c");
        gradosC = read.nextDouble();
        System.out.println("los grados F son: " + (32+(9*gradosC/5)));
    }
    
}
