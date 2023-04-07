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
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        String opcion = sc.nextLine();
        convertir(euros,opcion);
    }
    public static void convertir(String euros, String opcion) {
        int Ieuros,Iopcion;
        double cambio;
        Ieuros = Integer.parseInt(euros);
        Iopcion = Integer.parseInt(opcion);
        
        switch (Iopcion) {
            case 1:
                cambio=0.86*Ieuros;
                System.out.println("El cambio a Libras es:  "+ cambio);
                break;
            case 2:
                cambio=1.28611*Ieuros;
                System.out.println("El cambio a Dolares es:  "+ cambio);
                break;
            case 3:
                cambio=129.852*Ieuros;
                System.out.println("El cambio a Yenes es:  "+ cambio);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
    }
   
}

