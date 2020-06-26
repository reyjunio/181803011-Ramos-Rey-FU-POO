
public class empleado {
    int idEmpleado;
    String nombre,paterno,materno;

    public empleado() {
    }

    public empleado(int idEmpleado, String nombre, String paterno, String materno) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    @Override
    public String toString() {
        return "empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + '}';
    }
    
    
    public String nombreCompleto(){
        return this.nombre + this.paterno + this.materno;
    }
    
}
