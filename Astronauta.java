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

public static class Persona{

private String nombre;
private String apellido;
private int edad;
private String sexo;   
​

public String getNombre(){
    return nombre;
}
public String getApellido(){
    return apellido;
}
public int getEdad(){
    return edad;
}
public String getSexo(){
    return sexo;
}
​
//Métodos públicos para establecer los datos
​
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setApellido(String apellido){
    this.apellido = apellido;
}
public void setEdad(int edad){
    this.edad = edad;
}
public void setSexo(String sexo){
    this.sexo = sexo;
}

}
