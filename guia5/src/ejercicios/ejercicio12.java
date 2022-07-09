//12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package ejercicios;

import java.util.Scanner;


public class ejercicio12 {

   
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
   String cadena;
   int correctas=0,incorrectas=0;
   
        
        
        do {
            System.out.println("ingrese la cadena");
        cadena=read.nextLine();
        
            if (cadena.length() == 5 && cadena.startsWith("X") && cadena.endsWith("O")) {
                incorrectas++;
            }else if (cadena.equals("&&&&&")){
                System.out.println("fin");
              break;  
            }else{
                incorrectas++;
                
            }
                
        
        }  while (cadena.equals(cadena));
        System.out.println("se ingresaron " + correctas + " codigos correctos\n"
                    + "se ingresaron " + incorrectas + " codigos incorrectos");
    }

}
