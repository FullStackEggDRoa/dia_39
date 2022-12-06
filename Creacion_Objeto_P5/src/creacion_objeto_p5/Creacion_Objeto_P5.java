/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacion_objeto_p5;

import Entidad.Persona;
import java.util.Date;

/**
 *
 * @author droa
 */
public class Creacion_Objeto_P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona("Daniel");
        Date fecha=new Date(122,1,12,2,10,15);
        
        p2.setApellido("Roa");
        //p2.setNacimiento(nacimiento);
        p2.setNacionalidad("Ecuatoriana");
        p2.setNacimiento(fecha);
        
        System.out.println(p2.getNombre()+" "+p2.getApellido());
        System.out.println(p2);
    }
    
}
