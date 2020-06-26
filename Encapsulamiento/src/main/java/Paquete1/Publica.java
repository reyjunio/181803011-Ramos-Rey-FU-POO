
package Paquete1;

public class Publica {
    
    public String publico;
    
    public void metodoPublico(){
        System.out.println("Soy un metodo publico");
    }

    @Override
    public String toString() {
        return "publica{" + "publico=" + publico + '}';
    }  
}
