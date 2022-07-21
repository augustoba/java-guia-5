//12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.

package extras;

import java.util.Scanner;

public class Ejercicio12 {

   
    public static void main(String[] args) {
        String contador,numeroModificado;
        
        
        numeroModificado="";
        contador="";
        for (int i = 0; i < 1000; i++) {
            contador=""+i; // al concatenar un string con un numero se convierte en string
      
                
            
            if (i<10){
                
                contador ="00"+i;
                
                //System.out.println(contador);
            }else if (i<100){
                contador ="0"+i;
               
               // System.out.println(contador);
            }else if(i >=100){
                contador=""+i;
                //System.out.println(contador);
            }
                   numeroModificado= contador.replace('3', 'E');//replace reemplaza las letras que encuentra por la que se le pide
                   System.out.println(numeroModificado);
          
                
            
        }
                    
            
    }

}
