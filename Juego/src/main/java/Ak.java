//clase plantilla poder crear objetos

public class Ak {

    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;

    //constructor de un solo parametro
    public Ak(String tipo) {
        this.tipo = tipo;
    }

    //constructor vacio
    public Ak() {
    }

    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio = danio;
        this.velocidadDisparo = velocidadDisparo;
    }

    //metodos son las acciones
    public void disparar() {
        System.out.println("Te estoy disparando con un daño de " + danio);
    }

    public void apuntar() {
    }

    public void cargar() {
    }
    //metodo predefinido por oracle

    @Override
    public String toString() {
        return "Ak{" + "\n tipo=" + tipo + "\n cargador=" + cargador + "\n precision=" + precision + "\n velocidadCarga=" + velocidadCarga + " \n precio=" + precio + "\n danio=" + danio + "\n velocidadDisparo=" + velocidadDisparo + '}';
    }

}
