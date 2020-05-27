
import java.util.Scanner;

//para validar que es un triangulo la suma de dos de sus lados debe ser mayor al tercer lado
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner lado = new Scanner(System.in);
        
        System.out.print("lado 1: ");
        double l1=lado.nextDouble();
        
        System.out.print("lado 2: ");
        double l2=lado.nextDouble();
        
        System.out.print("lado 3: ");
        double l3=lado.nextDouble();
        
        if((l1+l2)>l3 && (l1+l3)>l2 && (l3+l2)>l1){
            System.out.println("Es un Triangulo");
            
            if(l1==l2 && l1==l3 && l3==l2){
                System.out.println("El triangulo es equilatero");
                
            }
            else if (l1==l2 || l1==l3 || l3==l2){
                System.out.println("El triangulo es isoseles");
            }
            else {
                System.out.println("El triangulo es escaleno");
            }
        }
        else {
            System.out.println("NO ES UN TRIANGULO");
        }
                
    }
    
}
