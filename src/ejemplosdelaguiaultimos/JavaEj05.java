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
public class JavaEj05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        int doble = numero*2;
        int triple = numero*3;
        double raiz = Math.sqrt(numero);
        System.out.println("El doble del numero es : "+doble);
        System.out.println("El triple del numero es : "+triple);
        System.out.println("La raiz cuadrada del numero es : "+raiz);
    }
    
}
