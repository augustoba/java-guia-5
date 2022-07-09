//1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma
package ejercicios;

import java.util.Scanner;


public class ejercicio1 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1,num2;
        
        System.out.println("ingrese los dos numeros");
        num1= read.nextInt();
        num2= read.nextInt();
        System.out.println("la suma de los numeros es :"+( num1 + num2));
    }
    
}
