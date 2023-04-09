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
public class JavaEj16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano, buscar;
        int contador = 0;
        int posicionNoRepetido = 0;

        System.out.print("Ingrese el tamaño del vector: ");
        tamano = sc.nextInt();
        int[] arregloOriginal = new int[tamano];
        int[] posicionRepetidos = new int[tamano];
        arregloOriginal = llenarVector(arregloOriginal, tamano);

        System.out.print("Ingrese un numero a buscar en el vector: ");
        buscar = sc.nextInt();

        for (int i = 0; i < tamano; i++) {

            if (buscar == arregloOriginal[i]) {
                contador += 1;
                posicionNoRepetido = i + 1;
                posicionRepetidos[i] = i;
            }
        }
        if (contador == 0) {
            System.out.println("El numero no se encuentra en el vector");
        } else if (contador == 1) {
            System.out.println("El numero se encuentra, y esta en la posición: " + "[ " + posicionNoRepetido + " ]");
        } else if (contador > 1) {
            System.out.print("El numero se encuentra repetido en las posiciones: ");
            for (int i = 0; i < tamano; i++) {
                if (posicionRepetidos[i] == 0) {
                } else {
                    System.out.print("[ " + (posicionRepetidos[i] + 1) + " ]");
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < tamano; i++) {
            System.out.println(arregloOriginal[i] + " [" + (i + 1) + "]");
        }
    }

    public static int[] llenarVector(int[] arreglo, int tamano) {
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        return arreglo;
    }
}