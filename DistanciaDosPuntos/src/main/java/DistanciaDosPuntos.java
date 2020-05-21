
import java.util.Scanner;

/*
Calcular la distancia entre 2 puntos dadas sus coordenadas cartesianas
 */
public class DistanciaDosPuntos {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("introduce laas coordenadas");
        
        
        System.out.println("x1 : ");
        double x1=numero.nextDouble();
        
        System.out.println("x2 : ");
        double x2=numero.nextDouble();
        
        System.out.println("y1 : ");
        double y1=numero.nextDouble();
        
        System.out.println("y2 : ");
        double y2=numero.nextDouble();
        
        double d=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        
        double resultado = Math.sqrt(d);
        
        
        System.out.println("distancia: " +resultado);
        
        
        
    }
    
}
