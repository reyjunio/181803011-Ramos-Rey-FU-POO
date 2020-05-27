
import java.util.Scanner;

public class Grupo {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        char sexo, n;
        System.out.println("introduce tu sexo (H)hombre o (M) mujer");
        sexo = numero.next().charAt(0);

        System.out.println("introduce tu inicial nombre");
        n = numero.next().charAt(0);
        
        
        
        if (sexo == 'm') {
            if (n == 'a' || n == 'b' || n == 'c' || n == 'd' || n == 'e' || n == 'f' || n == 'g' || n == 'h' || n == 'i' || n == 'j' || n == 'k' || n == 'l') {
                System.out.println("Tu grupo es A");
            }else 
                System.out.println("Tu grupo es b");
            
                    
        }
        else if(sexo=='h'){
            if (n == 'y' || n == 'z' || n == 'q' || n == 'o' || n == 'p' || n == 'r' || n == 's' || n == 't' || n == 'u' || n == 'v' || n == 'w' || n == 'x') {
                System.out.println("Tu grupo es A");
            }else 
                System.out.println("Tu grupo es b");
        
            
        }
        

    }

}
