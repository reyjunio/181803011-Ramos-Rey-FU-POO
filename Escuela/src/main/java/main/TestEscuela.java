/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
 
import Alumno.Alumno;
import maestro.maestro;


public class TestEscuela {
    public static void main(String[] args) {
        Alumno JuanManuel = new Alumno("javier maldonado");
        maestro jordi = new maestro();
        jordi.setNombre("jordi");
        jordi.setPaterno("Crux");
        jordi.setMaterno("Medrano");
        JuanManuel.setNombre("javi");
        JuanManuel.setPaterno("Maldonado");
        JuanManuel.setMaterno("Garcia");
        JuanManuel.setEdad(18);
        System.out.println(JuanManuel.getNombre());
        System.out.println(jordi.getNombre());
        
        
    }
    
}
