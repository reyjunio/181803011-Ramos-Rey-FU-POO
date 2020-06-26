
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
        this.arma=new Ak();
    }
    
    public void equiparArma(int valor) {
        arma=new Ak(valor); 
    }
    
    public void recibirDanio(double danio) {
       this.vida-=danio;
    }
    
    
    
    @Override
    public String toString() {
        return "personaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }

}
