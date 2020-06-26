
public class area {
    int idArea;
    String nombre;

    public area() {
    }

    public area(int idArea, String nombre) {
        this.idArea = idArea;
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return "area{" + "idArea=" + idArea + ", nombre=" + nombre + '}';
    }
    
    
    
}
