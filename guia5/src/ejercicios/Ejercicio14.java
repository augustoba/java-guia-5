//14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €
package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

   
          
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int opc;
        double valor;
        String moneda = "";

        System.out.println("Ingrese la cantidad de Euros: ");
        valor = read.nextDouble();
        
        do {
            System.out.println("1 - Libras");
            System.out.println("2 - Dolar");
            System.out.println("3 - Yen");
            opc = read.nextInt();
        } while (opc > 3 || opc <1);
        
        switch(opc) {
            case 1:
                moneda = "Libras";
                break;
                
            case 2: 
                moneda = "Dolar";
                break;
                
            case 3: 
                moneda = "Yen";
                break;             
        }
         convertir(valor, moneda);
    }
   public static void convertir(Double valor, String divisa){
       double aux = valor;
       
       switch (divisa) {
           case "Libras":
               valor = valor * 0.86;
               break;
           case "Dolar":
               valor = valor * 1.28611;
               break;
           case "Yen": 
               valor = valor * 129.852;
               break;
           default : System.out.println("ingrese una opcion valida");
      
       }
       System.out.println( aux + " Euros equivalen a " + valor + " " + divisa + "");

   }
}
    