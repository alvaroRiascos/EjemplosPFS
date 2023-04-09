/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejemplosdelaguiaultimos;

import java.util.Scanner;

/**
 *
 * @author ALVARO RIASCOS
 */
public class JavaEj14 {

    public static void main(String[] args) {
        String euros;

        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERTIR DE EUROS A TRES MONEDAS DIFERENTES");
        System.out.println("Digite la cantidad de euros");
        euros = sc.nextLine();
        System.out.println("A que moneda desea convertir: ");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");
        String opcion = sc.nextLine();
        opcion = opcion.toLowerCase();
        convertir(euros, opcion);
    }

    public static void convertir(String euros, String Iopcion) {
        int Ieuros;
        double cambio = 0;
        Ieuros = Integer.parseInt(euros);

        switch (Iopcion) {
            case "libras":
                cambio = 0.86 * Ieuros;

                break;
            case "dolares":
                cambio = 1.28611 * Ieuros;
                break;
            case "yenes":
                cambio = 129.852 * Ieuros;
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        if (Iopcion.equals("libras") || Iopcion.equals("dolares") || Iopcion.equals("yenes")) {
            System.out.println("El cambio en " + Iopcion.toUpperCase() + " es:" + cambio);
            System.out.println("************************");
            System.out.println("Hasta pronto =======>");
        } else {
            System.out.println("Hasta pronto");
        }
    }

}
