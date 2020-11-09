/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscesargutierrez;

/**
 *
 * @author vmbv2
 */
public class Ejercicio3 {
    public static void main(String[] args){
        
        int M = 6, T = 1, K = -10, r1;
        
        System.out.println("---------------------------------------");
        
        System.out.println(M + " " + "mayor que" + " " + T);
        if(M > T){
            System.out.println("--VERDADERO--");
        }
        else{
            System.out.println("--FALSO--");
        }
        
        
        System.out.println("---------------------------------------");
        
        
        System.out.println(T + " " + "/" + " " + K + " " + "=" + " " + "-5");
        if (K != 0){
            r1 = T / K;
            
            if(r1 == -5){
                System.out.println("--VERDADERO--");
            }
            else{
                System.out.println("--FALSO--");
            }
        }else{
            System.out.println("--No se puede dividir entre 0--");
        }
        
        
        System.out.println("---------------------------------------");
        
        
        
        System.out.println(M + " " + "+" + " " + T + " " +  "= 7");
        if(M + T == 7){
            System.out.println(M + " " + "-" + " " + T + " " +  "= 5");
            System.out.println("--VERDADERO--");
        }
        else{
            System.out.println(M + " " + "-" + " " + T + " " +  "= 5");
            System.out.println("--FALSO--");
        }
        System.out.println("---------------------------------------");
    }
}
