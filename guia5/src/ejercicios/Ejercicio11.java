//11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.
package ejercicios;

import java.util.Scanner;


public class Ejercicio11 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num1,num2,opc;
        String aux="";
        
        
        System.out.println("ingrese los 2 numeros");
        num1=read.nextInt();
        num2=read.nextInt();
        
     do {
            System.out.println("***********MENU****************");
            System.out.println("         1.Sumar");
            System.out.println("         2.Restar");
            System.out.println("         3.Multiplicar");
            System.out.println("         4.dividir");
            System.out.println("         5.Salir");
            System.out.println("         Elija una opcion.......");
            
            opc= read.nextInt();
            
        switch(opc){
   
   case 1 :
       System.out.println("la suma es:"+ (num1+num2));
      break; 
   
   case 2 :
      System.out.println("la resta es:"+ (num1-num2));
      break;
   
   case 3 :
      System.out.println("la multiplicacion es:"+ (num1*num2));
      break;
      
       case 4 :
      System.out.println("la division es:"+ (num1/num2));
      break;
      
      
      case 5 :
          System.out.println("esta seguro que desea salir? S/N");
          aux=read.next();
                    
          break;
                
   default : System.out.println("ingrese una opcion valida");
      }
              
        } while ("N".equals(aux.toUpperCase()));
        
    }

}
