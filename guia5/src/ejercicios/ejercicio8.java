//8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.
package ejercicios;
import java.util.Scanner;
public class ejercicio8 {

   
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String frase;
    int aux;
    
        System.out.println("ingrese una frase");
        frase= read.next();
        aux= frase.length();
        if (aux == 8) {
            System.out.println("correcto la cantidad de letras es: " + aux);
            
        }
        else{
            System.out.println("incorrecto la cantidad de letras es: " + aux);
        }    
            
    }

}
