//16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

package extras;

import java.util.Scanner;

public class Ejercicio16 {
    
   
    public static void main(String[] args) {
      pedirNombreS();
    }

    public static void pedirNombreS(){
        Scanner read = new Scanner(System.in);
        int edad,aux;
        String nombre,opc;
        
               
        do {
               
        System.out.println("ingrese el nombre ");
        nombre=read.next();
         System.out.println("ingrese edad");
        edad=read.nextInt();
        
            if (edad<18) {
                System.out.println("es menor");
                
            }else{
                System.out.println("es mayor");
            }
            System.out.println("ingrese no para terminar");
            
             opc=read.next();
            
        } while (!"no".equals(opc));
    }
}
