
public class maquina {
    int idMaquina;
    String nombre;
    area area;

    public maquina() {
    }

    public maquina(int idMaquina, String nombre, area area) {
        this.idMaquina = idMaquina;
        this.nombre = nombre;
        this.area = area;
    }

    @Override
    public String toString() {
        return "maquina{" + "idMaquina=" + idMaquina + ", nombre=" + nombre + ", area=" + area + '}';
    }
    
    
    
}
