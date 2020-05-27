//clase plantilla poder crear objetos
public class Ak {
    
        String tipo;
        int cargador;
        int precision;
        double velocidadCarga;
        double precio;
        int danio;
        double velocidadDisparo;
        
        //metodos son las acciones
        public void disparar(){
            System.out.println("Te estoy disparando con un daño de "+danio);
        }
        public void apuntar(){}
        public void cargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio + ", velocidadDisparo=" + velocidadDisparo + '}';
    }
        
        

   
        
        
}
        
    

