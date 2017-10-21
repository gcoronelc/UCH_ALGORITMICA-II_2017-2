/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import pe.uch.alumno.Alumno;
import pe.uch.alumno.service.Service;

/**
 *
 * @author docente
 */
public class TestingAlumno {
    
    public TestingAlumno() {
    }
    
    @Test
    public void Prueba(){
       
    Service alumno = new Service("Josias", 18, 14, 20);
    
        System.out.println("El nombre es :" +alumno.getNombre());
        System.out.println("El nombre es :" +alumno.getEdad());
            
        
        
    }
            
            
    
}
