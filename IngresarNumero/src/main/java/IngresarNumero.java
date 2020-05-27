
import java.util.Scanner;

public class IngresarNumero {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int i = 1, j = 0;
        int n;

        do {
            System.out.println("numero"+i);
            n = numero.nextInt();
            if (n > j) {

                i++;
            } else {
                System.out.println("introduce otro numero");
                i = i;
            }
            j = n;

        } while (i < 6);
    }

}
