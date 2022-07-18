//11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
package extras;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num,cantidad;
         System.out.println("ingrese el numero");
         num = read.nextInt();
         cantidad=0;
                
        while (num != 0) {
            num = num / 10;
            cantidad++;
        }
        System.out.println("el numero tiene " + cantidad + " digito/s");
    }

}
