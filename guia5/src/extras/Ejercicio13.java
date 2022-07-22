//13. Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123
package extras;

import java.util.Scanner;


public class Ejercicio13 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int alturaEscalera;
        String aux;
        System.out.println("ingrese la altura de la escalera");
        alturaEscalera=read.nextInt();
        
        aux="";
        for (int i = 0; i <= alturaEscalera-1; i++) {
            aux=aux+(i+1);
                 
            System.out.println(aux);
                
            
        }
    }

}
