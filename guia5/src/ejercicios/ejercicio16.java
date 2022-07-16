//16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio16 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Random rand = new Random();
        int aux,ran;
        
        
        System.out.println("ingrese tamaño de vector");
        aux= read.nextInt();
        int vector []= new int[aux];
        
        for (int i = 0; i < aux; i++) {
            vector[i]= rand.nextInt(100)+1;
                 System.out.println(vector[i]);
        }
        
    }

}