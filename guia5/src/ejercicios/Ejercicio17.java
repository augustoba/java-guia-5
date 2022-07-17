package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, aux, longitud, cont1, cont2, cont3, cont4, cont5;
        String transform;
        System.out.println("ingrese tamaño del vector");
        n = read.nextInt();

        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        int vector[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero hasta 5 digitos");
            aux = read.nextInt();
            transform = aux + "";
            longitud = transform.length();

            if (longitud <= 5) {
                vector[i] = aux;
                switch (longitud) {

                    case 1:
                        cont1++;
                        break;
                    case 2:
                        cont2++;
                        break;
                    case 3:
                        cont3++;
                        break;
                    case 4:
                        cont4++;
                        break;
                    case 5:
                        cont5++;
                        break;

                }

            } else {
                System.out.println("numero incorrecto, ingrese un numero de  hasta 5 cifras");
                vector[i] = read.nextInt();

            }
            System.out.println(i);
        }
        for (int j = 0; j < n - 1; j++) {
            System.out.println(vector[j]);

            System.out.println("la cantidad de numeros de 1 digitos son : " + cont1 + "\n"
                    + " la cantidad de numeros de 2 digitos son : " + cont2 + "\n"
                    + " la cantidad de numeros de 3 digitos son : " + cont3 + "\n"
                    + " la cantidad de numeros de 4 digitos son : " + cont4 + "\n"
                    + " la cantidad de numeros de 5 digitos son : " + cont5 + "\n");
        }
    }
}
