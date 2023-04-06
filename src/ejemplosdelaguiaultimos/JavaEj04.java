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
public class JavaEj04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe una cantidad en °C");
        double grados = sc.nextInt();
        double f = 32 + (9*grados/5);
        System.out.println("la conversion a ° Fahrenheit es : "+ f);
    }
    
}
