import java.util.Scanner;

public class LeerJava {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("dame un numero ");
        int numero=leer.nextInt();
        System.out.println("el numero leido es "+numero);
        
        System.out.println("dame un numero ");
        double numero2=leer.nextDouble();
        System.out.println("el numero leido es "+numero);
        
        System.out.println("dame tu nombre ");
        String nombre=leer.nextLine();
        System.out.println("el nombre es "+nombre);
       
    }
}
