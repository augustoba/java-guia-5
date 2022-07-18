//9. Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
//resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
package extras;

import java.util.Scanner;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int numero1,numero2,cociente;
        
        cociente=0;
        
        System.out.println("ingrese dos numeros");
        
        numero1=read.nextInt();
        numero2=read.nextInt();
        
        while (numero1> numero2){
            
        numero1=numero1-numero2;
           cociente++;
            
        }
        
        System.out.println("cociente = " + cociente);  
        System.out.println("resto = " + numero1);
        
    }

}
