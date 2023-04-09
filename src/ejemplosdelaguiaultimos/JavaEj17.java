/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejemplosdelaguiaultimos;

import java.util.Scanner;

/**
 *
 * @author ALVARO RIASCOS
 */
public class JavaEj17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano;
        int numero = 0;
        int digitos1 = 0;
        int digitos2 = 0;
        int digitos3 = 0;
        int digitos4 = 0;
        int digitos5 = 0;

        System.out.println("Ingrese el tamaño del arreglo");
        tamano = sc.nextInt();
        
        int[] arreglo = new int[tamano];
        String[] cadena = new String[tamano];
        int[] tamanoNumero = new int[tamano];
        
        arreglo = llenarArreglo(arreglo, tamano, numero, sc);
        for (int i = 0; i < tamano; i++) {
            cadena[i] = String.valueOf(arreglo[i]);
            tamanoNumero[i] = cadena[i].length();
            switch (tamanoNumero[i]) {
                case 1:
                    digitos1++;
                    break;
                case 2:
                    digitos2++;
                    break;
                case 3:
                    digitos3++;
                    break;
                case 4:
                    digitos4++;
                    break;
                case 5:
                    digitos5++;
                    break;
            }
        }
        System.out.println("La cantidad de numeros de 1 digito es: " + digitos1);
        System.out.println("La cantidad de numeros de 2 digito es: " + digitos2);
        System.out.println("La cantidad de numeros de 3 digito es: " + digitos3);
        System.out.println("La cantidad de numeros de 4 digito es: " + digitos4);
        System.out.println("La cantidad de numeros de 5 digito es: " + digitos5);

    }

    public static int[] llenarArreglo(int[] arreglo, int tamano, int numero, Scanner sc) {
        int tamanoNumero;
        String cadena;
        for (int i = 0; i < tamano; i++) {
            do {
                System.out.println("Digite un numero de hasta 5 digitos en la posicion [ " + (i + 1) + " ]");
                numero = sc.nextInt();
                cadena = String.valueOf(numero);
                tamanoNumero = cadena.length();
            } while (tamanoNumero > 5);
            arreglo[i] = numero;
        }
        return arreglo;
    }
}
