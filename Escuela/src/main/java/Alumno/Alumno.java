
package Alumno;


public class Alumno {
    private String nombre,paterno,materno,matricula,genero,carrera,correo;
    
    private int edad,cuatrimestre;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Alumno(String nombre, String paterno, String materno, String matricula, String genero, String carrera, String correo, int edad, int cuatrimestre) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.matricula = matricula;
        this.genero = genero;
        this.carrera = carrera;
        this.correo = correo;
        this.edad = edad;
        this.cuatrimestre = cuatrimestre;
    }
    
    
    //grtter i setters

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

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", matricula=" + matricula + ", genero=" + genero + ", carrera=" + carrera + ", correo=" + correo + ", edad=" + edad + ", cuatrimestre=" + cuatrimestre + '}';
    }
    
    
    
}
