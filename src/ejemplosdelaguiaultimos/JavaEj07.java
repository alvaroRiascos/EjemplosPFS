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
public class JavaEj07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        String frase = sc.nextLine();
        if(frase.equals("eureka")){
            System.out.println("La frase es correcta");
        }
        else{
            System.out.println("La frase es incorrecta");
        }
    }
}
