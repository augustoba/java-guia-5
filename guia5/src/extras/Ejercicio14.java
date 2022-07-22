//14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias
package extras;

import java.util.Scanner;

public class Ejercicio14 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int flia, hijos, edades, aux,contador;
        
        System.out.println("ingrese la cantidad de familias");
        flia= read.nextInt();
        
        aux=0;
        contador=0;
        for (int i = 0; i < flia; i++) {
            
            System.out.println("ingrese cantidad de hijos de la flia " + (i+1));
            hijos= read.nextInt();
            
                for (int j = 0; j < hijos; j++) {
                    
                    System.out.println("ingrese la edad del hijo "+ (j+1));
                    edades= read.nextInt();
                    
                    aux=aux+edades;
                    contador++;
            }
            
            
        }
        System.out.println("la media de edad es :"+ (aux/contador) );
    }

}
