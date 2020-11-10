/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareamodulo3;

/**
 *
 * @author vmbv2
 */
public class TareaModulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

 //Creando el objeto persona 
    Persona persona = new Persona();

    persona.setNombre("Eduardo");
    persona.setApellido("Suarez");
    persona.setEdad (20);
    persona.setSexo ("M");
    System.out.println("Nombre: " + persona.getNombre() );
    System.out.println("apellido: " + persona.getApellido() );
    System.out.println("Edad: " + persona.getEdad() );
    System.out.println("Sexo: " + persona.getSexo() );
    }

}
