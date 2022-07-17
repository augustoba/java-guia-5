//6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
package extras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int cantidadPersonas, contador;
        double altura, alturaTotal, alturaBajo;
        alturaTotal = 0;
        alturaBajo = 0;
        contador = 0;
        System.out.println("ingrese cantidad de personas");
        cantidadPersonas = read.nextInt();

        for (int i = 0; i < cantidadPersonas ; i++) {
            System.out.println("ingrese altura de la persona " + (i+1));
            altura = read.nextDouble();
            alturaTotal = alturaTotal + altura;
            if (altura < 1.6) {
                alturaBajo = alturaBajo + altura;
                contador++;

            }

        }

        System.out.println("el promedio de alturas es :" + (alturaTotal / cantidadPersonas));
        System.out.println("el promedio de estaturas por debajo de 1.6 mts es : " + (alturaBajo / contador));
    }

}
