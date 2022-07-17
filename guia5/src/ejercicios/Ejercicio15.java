//15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
package ejercicios;


public class Ejercicio15 {

   
    public static void main(String[] args) {
      
	int [] arr = new int [100];
        vectorRelleno(arr);
    }

    public  static void vectorRelleno(int[]a){
        
        
        for (int i = a.length - 1; i >= 0; i--) {
	    a [i] = i + 1;
	    System.out.print("/" + a[i]);
	   }
        
    }
}
