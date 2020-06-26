//clase plantilla poder crear objetos

public class Ak {

    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;


    public Ak(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = "bronce";
                this.cargador = 5;
                this.precision = 75;
                this.velocidadCarga = 5;
                this.precio = 1000;
                this.danio = 10;
                this.velocidadDisparo = 10;
                break;
            case 2:
                this.tipo = "plata";
                this.cargador = 8;
                this.precision = 70;
                this.velocidadCarga = 4.5;
                this.precio = 2300;
                this.danio = 11;
                this.velocidadDisparo = 9.8;
                break;
            case 3:
                this.tipo = "oro";
                this.cargador = 10;
                this.precision = 85;
                this.velocidadCarga = 4.3;
                this.precio = 2500;
                this.danio = 13;
                this.velocidadDisparo = 9.7;
                break;
            case 4:
                this.tipo = "diamante";
                this.cargador = 20;
                this.precision = 95;
                this.velocidadCarga = 3;
                this.precio = 4000;
                this.danio = 20;
                this.velocidadDisparo = 9.4;
                break;
            case 5:
                this.tipo = "adamantium";
                this.cargador = 30;
                this.precision = 100;
                this.velocidadCarga = 1;
                this.precio = 10000;
                this.danio = 27;
                this.velocidadDisparo = 8;
                break;

        }
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

    public Ak() {
    }

    public String manuAk() {
        String menu = "Que tipo de arma desea \n";
        menu += "1-Bronce \n";
        menu += "2-Plata \n";
        menu += "3-Oro \n";
        menu += "4-diamante \n";
        menu += "5-Adamantium \n";
        return menu;
    }

    public double disparar() {
        return (this.danio * this.precision) / 100;
    }

    //metodo predefinido por oracle
    @Override
    public String toString() {
        return "Ak{" + "\n tipo=" + tipo + "\n cargador=" + cargador + "\n precision=" + precision + "\n velocidadCarga=" + velocidadCarga + " \n precio=" + precio + "\n danio=" + danio + "\n velocidadDisparo=" + velocidadDisparo + '}';
    }

}
