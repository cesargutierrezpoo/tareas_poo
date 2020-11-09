/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscesargutierrez;

import java.util.Scanner;

/**
 *
 * @author vmbv2
 */
public class Ejercicio2 {
    public static void main(String[] args){
    
        int r1, r2, r3, r4, num1, num2, num3, num4;

        Scanner miTeclado = new Scanner(System.in); 

        System.out.println("Ingrese el primer número:");
        num1 = miTeclado.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        num2 = miTeclado.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        num3 = miTeclado.nextInt();
        
        System.out.println("Ingrese el cuarto número:");
        num4 = miTeclado.nextInt();
        
        
        r1 = num1 + num2 + num3 + num4;
        r2 = num1 - num2 - num3 - num4;
        r3 = num1 * num2 * num3 * num4;
        r4 = num1 / num2 / num3 / num4;
        
        
        System.out.println("Total suma: "+r1);
        System.out.println("Total resta: "+r2);
        System.out.println("Total multiplicación: "+r3);
        System.out.println("Total división: "+r4);
                
    }
}
