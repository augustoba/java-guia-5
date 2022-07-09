//7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
package ejercicios;

import java.util.Scanner;
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase,aux;
        aux="eureka";
        System.out.println("ingrese una frase");
        frase= read.nextLine();
        if (frase.equals(aux)) {
            System.out.println("Correcto");
            
        }
        else   {
            System.out.println("Incorrecto");
        }
    }
    
}
