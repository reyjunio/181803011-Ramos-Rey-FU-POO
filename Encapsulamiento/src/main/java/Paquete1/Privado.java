
package Paquete1;


public class Privado {
    private String privado;
    
    private void metodoPrivado(){
        System.out.println("Soy privado");
    }
    public void imprimePrivado(){
        this.privado="yo soy privado";
        System.out.println(this.privado);
        this.metodoPrivado();           
    } 
}
