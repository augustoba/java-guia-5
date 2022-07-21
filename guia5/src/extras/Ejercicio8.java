//8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

package extras;

import java.util.Scanner;


public class Ejercicio8 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
    int num, contadorNum,numPar,numImpar;
    
    numPar=0;
    numImpar=0;
    
    System.out.println("ingrese un numero");
        num=read.nextInt();
    do {  
        
         if (num<0){
        break;
    } else if (num%2==0) { // resto del numero
        numPar++;
        
          }  else {
               numImpar++;     
                  }  
        System.out.println("ingrese un numero");
        num=read.nextInt();
        
       
       }while(num%5!=0);
 
        System.out.println("los pares son: "+ numPar +"\n los impares son: "+ numImpar);
               
}
}