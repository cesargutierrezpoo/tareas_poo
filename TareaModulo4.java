/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareamodulo4;

// import <default package>.Ciudadano;
/**
 *
 * @author vmbv2
 */
public class TareaModulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ciudadano ciudadano = new Ciudadano();


        ciudadano.establecerEdad(45);
        System.out.println("Edad:"+ " " + ciudadano.obtenerEdad());
        
        ciudadano.establecerNombre("Julio Ramirez");
        System.out.println("Nombre:"+ " " + ciudadano.obtenerNombre());

        ciudadano.establecerExperiencia(9);
        System.out.println("Experiencia:" + " " + ciudadano.obtenerExperiencia() + " " + "años");


    }

}
