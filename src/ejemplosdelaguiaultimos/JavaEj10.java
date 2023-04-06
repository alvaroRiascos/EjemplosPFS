/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosdelaguiaultimos;

import java.util.Scanner;

/**
 *
 * @author ALVARO RIASCOS
 */
public class JavaEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un número límte positivo");
        int respuesta = leer.nextInt();
        int suma = 0;
        int numero;
        int contador = 0;
        while (suma <= respuesta) {

            System.out.println("Introduce un número");
            numero = leer.nextInt();
            suma += numero;
            contador++;
        }
        System.out.println("Haz introducido " + contador + " números");
        System.out.println("La suma total es " + suma + ".");
    }
}
