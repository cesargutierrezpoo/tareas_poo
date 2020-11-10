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
public class Formas {

    private String dibujar;
    private String color;
    private int largo;
    private int radio;
    private int angulo;
    private int area;

    public Formas(){

    }

    // set y get

    public void establecerDibujo(String dibujar){
        this.dibujar = dibujar;
    }

    public String obtenerDibujo(){
        return this.dibujar;
    }

    public void establecerRadio(int radio){
        this.radio = radio;
    }

    public int obtenerRadio(){
        return this.radio;
    }


    public void establecerAngulo(int angulo){
        this.angulo = angulo;
    }

    public int obtenerAngulo(){
        return this.angulo;
    }


    public void establecerArea(int area){
        this.area = area;
    }

    public int obtenerArea(){
        return this.area;
    }




    public void imprimirCirculo(){
        System.out.println("Nombre: " + dibujar);
        System.out.println("Radio: " + 3.14 * Math.pow(radio,2));
    }

    public void imprimirLinea(){
        System.out.println("Nombre: " + dibujar);
    }

    public void imprimirTriangulo(){
        System.out.println("Nombre: " + dibujar);
        System.out.println("Area: " + 0.43 * Math.pow(angulo, 2));
    }

    public void imprimirCuadrado(){
        System.out.println("Nombre: " + dibujar);
        System.out.println("Area: " + area * area);
    }

}
