//6. Crear un programa que dado un numero determine si es par o impar.
package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = read.nextInt();

        if (num % 2 == 0) {
            System.out.println("es par");
            }
            else{
            System.out.println("es impar");
                  }
        }

    }


