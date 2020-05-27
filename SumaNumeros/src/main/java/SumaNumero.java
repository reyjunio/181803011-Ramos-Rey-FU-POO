
import java.util.Scanner;

public class SumaNumero {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double num,c=0;
        System.out.println("Presiona '0' para salir del ciclo");

        do {
            System.out.print("ingresa un numero: ");
            num = numero.nextDouble();
            c += num;

        } while (num != 0);
        System.out.println("La suma de los numeros es : "+c);
    }

}
