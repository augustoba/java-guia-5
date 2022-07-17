//10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
package ejercicios;

import java.util.Scanner;


public class Ejercicio10 {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        int num,num2,aux;
        System.out.println("ingrese un numero limite");
        num = read.nextInt();
        aux=0;
        num2=0;
        while (aux <= num ){
            System.out.println("ingrese un numero");
            num2=read.nextInt();
            aux=aux+num2;
            
        }
        
    }

}
