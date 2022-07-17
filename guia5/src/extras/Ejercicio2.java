//2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

package extras;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        int A=5,B=6,C=8,D=9,aux;
        
        aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        
        System.out.println(A);
          System.out.println(B);
          System.out.println(C);
          System.out.println(D);
    }

}
