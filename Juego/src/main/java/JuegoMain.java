
import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {

        personaje p1 = new personaje("samuel");
        personaje p2 = new personaje("camilo");
        Scanner leer = new Scanner(System.in);
        int valor;

        System.out.println("Jugador 1 y jugador 2 elijan un arma");
        System.out.println("1.- bronce");
        System.out.println("2.- plata");
        System.out.println("3.- oro");
        System.out.println("4.- diamante");
        System.out.println("5.- adamantium");
        valor = leer.nextInt();
        p1.equiparArma(valor);
        valor = 0;
        valor = leer.nextInt();
        p2.equiparArma(valor);

        System.out.println(p1);
        System.out.println("\n El daño de disparo del arma es de " + p1.disparar() + " pts \n");

        System.out.println(p2);
        System.out.println("\n El daño de disparo del arma es de " + p2.disparar() + " pts");

    }

}
