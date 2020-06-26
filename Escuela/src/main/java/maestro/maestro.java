/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestro;

/**
 *
 * @author Riskys
 */
public class maestro {
    private String nombre,paterno,materno;

    public maestro() {
    }

    public maestro(String nombre, String paterno, String materno) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }
    
    

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return this.paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return this.materno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    

    @Override
    public String toString() {
        return "maestro{" + "nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + '}';
    }
    
    
    
    
}
