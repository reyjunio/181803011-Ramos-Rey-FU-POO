
import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        personaje samuel = new personaje("samuel");
        System.out.println(samuel.arma.manuAk());
        int valor = leer.nextInt();
        samuel.equiparArma(valor);
        System.out.println(samuel);
        personaje jimena = new personaje("jimena");
        System.out.println(jimena.arma.manuAk());
        valor = leer.nextInt();
        jimena.equiparArma(valor);
        System.out.println(jimena);
        System.out.println("El daño que haria es de " + jimena.arma.disparar());
        samuel.recibirDanio(jimena.arma.disparar());
        System.out.println(samuel);

    }

}
