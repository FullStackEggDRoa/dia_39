/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacion_objeto;

import Entidad.Persona;


/**
 *
 * @author Gabriela
 */
public class Creacion_Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan", "Ecuatoriano");
        
        System.out.println(persona2.getNombre());
        
        persona1.setNombre("Alejandra");
        persona2.setNombre("Jose");
        
        
        System.out.println(persona1.getNombre()); 
        System.out.println(persona2.getNombre());
        
        System.out.println("Persona 1");
        System.out.println(persona1);
        System.out.println("Persona 2");
        System.out.println(persona2);

    }

}
