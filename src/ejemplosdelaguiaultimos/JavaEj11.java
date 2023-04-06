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
public class JavaEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        String confirmacion ="n";
                    System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
        do {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("La división es: " + ((double)num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = sc.next();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo del programa...");
                       return;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion !=5 || confirmacion.equalsIgnoreCase(confirmacion) );
    }
}