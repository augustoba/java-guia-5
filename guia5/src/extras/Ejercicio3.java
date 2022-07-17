//3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
package extras;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String letra;
        
        System.out.println("ingrese una letra");
            letra = read.nextLine().toLowerCase();
        if ("a".equals(letra)||"e".equals(letra)||"i".equals(letra)||"o".equals(letra)|| "u".equals(letra)) {
            System.out.println(letra + " es una vocal");
            
        }
        else    {
            System.out.println(letra + " no es una vocal");
        }
        
    }

}
