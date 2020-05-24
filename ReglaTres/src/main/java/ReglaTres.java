
import java.util.Scanner;
//regla de tres calcular porcentaje

public class ReglaTres {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.print("ingresa porcentaje (%) : ");
        double porcen=numero.nextDouble();
        
        System.out.print("ingresa el numero total: ");
        double num=numero.nextDouble();
        
        double resul=num*porcen/100;
        
        System.out.println("El "+porcen+" % de "+num+" es "+resul);
    }
}
