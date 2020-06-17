
public class personaje {

    int vida;
    String nombre;
    Ak arma;
     
   

    public personaje() {
        this.vida = 100;
    }

    public personaje(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void equiparArma(int valor) {
        switch (valor) {
            case 1:
                this.arma = new Ak("bronce", 5, 75, 5, 1000, 10, 10);
                break;
            case 2:
                this.arma = new Ak("plata", 8, 70, 4.5, 2300, 11, 9.8);
                break;
            case 3:
                this.arma = new Ak("oro", 10, 85, 4.3, 2500, 13, 9.7);
                break;
            case 4:
                this.arma = new Ak("diamante", 20, 95, 3, 4000, 20, 9.4);
                break;
            case 5:
                this.arma = new Ak("adamantium", 30, 100, 1, 10000, 27, 8);
                break;
            default:System.out.println("No existe el arma");

        }   
    }
    
    public int disparar() {
       return  arma.danio;
    }


    @Override
    public String toString() {
        return "personaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }

}
