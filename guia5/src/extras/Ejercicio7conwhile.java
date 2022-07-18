//7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.
package extras;

import java.util.Scanner;


public class Ejercicio7conwhile {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numMax, numMin,num,contador,aux,suma;
        
        System.out.println("ingrese el valor maximo");
        aux= read.nextInt();
        
        
        numMax=0;
        numMin=0;
        suma=0;
        contador=0;
        while  (suma < aux){
            System.out.println("ingrese un numero ");
            num=read.nextInt();
            contador++;
            suma=suma+num;
            numMin= num;
                    
            if (num> numMax) {
                numMax=num;
                
            }
            else if (num< numMin){
                numMin=num;
        }
        }
        
        System.out.println("el promedio de numeros ingresados es: " + suma/contador);
        System.out.println("el numero maximo ingresado es: " + numMax 
                + "\n el numero minimo inresado es: "+ numMin);
    }

}
