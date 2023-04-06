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
public class JavaEj13 {

    public static void main(String[] args) {
        int tamano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño (N) del cuadrado,");
        tamano = sc.nextInt();
        for (int i = 0; i < tamano; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < tamano - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < tamano - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < tamano; i++) {
            System.out.print("*");
        }
    }

}
