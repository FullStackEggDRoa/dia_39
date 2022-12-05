/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Gabriela
 */
public class Persona {

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String nombre;
    public String nacionalidad;
    public Date nacimiento;

}
