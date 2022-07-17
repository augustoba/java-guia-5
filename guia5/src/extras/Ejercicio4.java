//4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano
package extras;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero;
        String aux = "";
        numero = 0;

        while (numero < 1 || numero > 10) {
            System.out.println("ingrese un numero entre 1 y 10");
            numero = read.nextInt();
        }

        switch (numero) {

            case 1:
                aux = "I";

                break;

            case 2:
                aux = "II";
                break;

            case 3:
                aux = "III";
                break;

            case 4:
                aux = "IV";
                break;

            case 5:
                aux = "V";
                break;

            case 6:
                aux = "VI";
                break;

            case 7:
                aux = "VII";
                break;

            case 8:
                aux = "VIII";
                break;

            case 9:
                aux = "IX";
                break;

            case 10:
                aux = "X";
                break;
        }

        System.out.println("el numero " + numero + " en romano es: " + aux);
    }

}
