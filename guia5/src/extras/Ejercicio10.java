//10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.
package extras;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();// se instancia random para poder aplicarlo en los numeros
        int numero1, numero2;
        double resultado, respuesta;

        numero1 = aleatorio.nextInt(10) + 1;//  se aplica random (10) es el numero max que pedimos + 1 es para que no salga 0
        numero2 = aleatorio.nextInt(10) + 1;
        System.out.println(numero1 + "\n" + numero2);
        do {
            System.out.println("ingrese  numero");
            respuesta = read.nextDouble();
            resultado = numero1 / numero2;

            if (resultado != respuesta) {
                System.out.println("numero incorrecto");
            } else {
                System.out.println("numero correcto" + "\n" + resultado);

            }

        } while (resultado != respuesta);
    }

}
