//15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main. 
package extras;

import java.util.Scanner;

public class Ejercicio15 {

   
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int opc,num1,num2;
        
        System.out.println("ingrese dos numeros");
        num1=read.nextInt();
        num2=read.nextInt();
        do {
        System.out.println("ingrese una opcion");
        System.out.println("1- suma");
        System.out.println("2- resta");
        System.out.println("3- multiplicacion");
        System.out.println("4- division");
        System.out.println("5- salir");
        opc=read.nextInt();
        
            
        
        
        switch (opc){
            
            case 1:
                
                 sumar( num1, num2);
                break;
                
                case 2:
                 restar( num1, num2);
                break;
                
                case 3:
                    multiplicar( num1, num2);
                break;
                
                case 4:
                    dividir( num1,  num2);
                break;
                
                 case 5:
                    
                break;
                default:
                 System.out.println("ingrese una opcion correcta");
        }
        } while (opc !=5);
        
    }
    public static void sumar(int num1, int num2){
        
        int suma;
        
        suma=num1+num2;
        System.out.println("suma = " + suma);
    }
    
    public static void restar(int num1, int num2){
        
        int resta;
        
        resta=num1-num2;
        System.out.println("resta = " + resta);
        }
    
    
    public static void multiplicar(int num1, int num2){
        
        int multiplicacion;
        
        multiplicacion=num1*num2;
        System.out.println("multiplicacion = " + multiplicacion);
        }

    public static void dividir(double num1, double num2){
        
        double division;
        
        division= (num1/num2);
        System.out.println("division = " + division);
        }
    
}
