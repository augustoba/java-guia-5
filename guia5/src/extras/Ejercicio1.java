//1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package extras;

import java.util.Scanner;
public class Ejercicio1 {

   
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         
         int minutos;
         double dias,horas;
         
         System.out.println("ingrese la cantidad de minutos");
         minutos = read.nextInt();
         
                
         System.out.println(" Dias :" + Math.floor((minutos/60)/24) + "\n Horas :"+ Math.floor(minutos /60));
    }

}
