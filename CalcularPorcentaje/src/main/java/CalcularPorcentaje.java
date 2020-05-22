
import java.util.Scanner;

/*
calcule el porcentaje de reprobación de un grupo, 
a partir de la cantidad total de alumnos que presentaron un examen y el número 
de alumnos que lo reprobaron
 */
public class CalcularPorcentaje {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.print("Cantidad de alumnos que presentaron un examen : ");
        double alum=numero.nextDouble();
        
        System.out.print("Cantidad de alumnos que reprobaron :  ");
        double repro=numero.nextDouble();
        
        System.out.println((repro/alum)*100+"% reprobo");
        
    }
}
