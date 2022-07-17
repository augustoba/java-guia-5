//5. Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.
package extras;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tratamiento;
        String tipoSocio;
        System.out.println("ingrese el tipo de socio");
        tipoSocio = read.nextLine().toLowerCase();
        System.out.println("ingrese el costo del tratamiento");
        tratamiento = read.nextInt();
        
        switch (tipoSocio) {

            case "a":
                System.out.println("el socio tiene un descuento de un 50%"+ "\n el costo del tratamiento es : "+ (tratamiento *.5) );
                break;

            case "b":
                System.out.println("el socio tiene un descuento de un 35%"+ "\n el costo del tratamiento es : "+ (tratamiento *.65) );
                break;

            case "c":
                System.out.println("el socio  no tiene  descuento "+ "\n el costo del tratamiento es : "+ tratamiento  );
                break;
            default:
                System.out.println("ingrese una opcion correcta");
        }
    }

}
