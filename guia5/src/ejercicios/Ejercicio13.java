//13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *
package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       
        System.out.print("Por favor ingrese el tamaño del cuadrado: ");
        int n = read.nextInt();
        
        for(int i = 0; i < n; i++) {
         for(int j = 0; j < n; j++) {
         if(i == 0 || j == 0 || i == n - 1 || j == n - 1)
         {
         System.out.print("* ");
         }
         else {
                 System.out.print("  ");
                 }
         }
              System.out.println();
        }
  
   }
}
