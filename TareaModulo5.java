/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareamodulo5;

/**
 *
 * @author vmbv2
 */
public class TareaModulo5 {


    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();

        
        System.out.println("--------------------------------");
        circulo.imprimirCirculo();
        System.out.println("--------------------------------");
        linea.imprimirLinea();
        System.out.println("--------------------------------");
        triangulo.imprimirTriangulo();
        System.out.println("--------------------------------");
        cuadrado.imprimirCuadrado();
        System.out.println("--------------------------------");

    }

}
