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
public class JavaEj08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 de longitud");
        String frase = sc.nextLine();
        int longitud = frase.length();
        if (longitud==8) {
            System.out.println("La frase es correcta");
        }
        else{
            System.out.println("La frase es incorrecta");
        }
    }
}
