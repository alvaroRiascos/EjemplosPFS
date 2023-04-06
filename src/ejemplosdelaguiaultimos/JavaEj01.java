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
public class JavaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("digite un primer numero");
        int numero1 = sc.nextInt();
        System.out.println("digite un segundo numero");
        int numero2 = sc.nextInt();
        int suma = numero1+numero2;
        System.out.println("la suma de los numeros es: "+suma);
    }
    
}
