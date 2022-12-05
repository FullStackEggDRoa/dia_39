/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author droa
 */
public class Persona {

    
   //Atributos
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public Date nacimiento;
 
    //Constructores
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
