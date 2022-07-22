//18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario
package extras;

import java.util.Scanner;

public class Ejercicio18 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n,aux;
        System.out.println("ingrese el tamaño del vector");
        n=read.nextInt();
        int[]vector = new int[n];
        
        aux=0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero");
            vector[i]=read.nextInt();
            aux=aux+vector[i];
            
        }
        System.out.println("la suma es: " + aux);
        
    }

}
