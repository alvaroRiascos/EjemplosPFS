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
public class JavaEj06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if((numero%2)==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
    
}
