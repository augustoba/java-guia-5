//3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
package ejercicios;

import java.util.Scanner;
public class Ejercicio3 {

    
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      String frase;
        System.out.println("ingrese una frase");
        frase = read.nextLine();
        System.out.println("la frase en mayuscula es: " +  (frase.toUpperCase())+ ", la frase en minusculas es : " + (frase.toLowerCase()));
    }
    
}
