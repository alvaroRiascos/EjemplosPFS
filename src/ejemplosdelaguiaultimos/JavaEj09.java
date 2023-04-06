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
public class JavaEj09 {
    public static void main(String[] args) {
        String frase,letra,respuesta;
        Scanner sc = new Scanner(System.in);
        
       
        
        do{
        System.out.println("Escriba una frase");
        frase = sc.nextLine();
        letra = frase.substring(0, 1);
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("La frase es correcta");
            System.out.println("Desea continuar S/N");
            respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("s")){
                continue;
            }
            else if(respuesta.equalsIgnoreCase("n")){
                System.out.println("Saliendo ====================>");
                break;
            }
            break;
        }
        else{
            System.out.println("La frese es incorrecta");
        }
        }while(!frase.equalsIgnoreCase("a"));
    }
}
