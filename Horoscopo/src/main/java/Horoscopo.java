
import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Introduce tu dia de nacimiento : ");
        int dia = obj.nextInt();

        System.out.println("Introduce tu mes de nacimiento : ");
        int mes = obj.nextInt();

        switch (mes) {
            case 1:
                if (dia >= 21 && dia<32) {
                    System.out.println("acuario");
                } else if (dia >=1 && dia<21){
                    System.out.println("capricornio");
                }
                break;
            case 2:
                if (dia >= 21 && dia<29) {
                    System.out.println("piscis");
                } else if (dia >=1 && dia<21) {
                    System.out.println("acuario");
                }
                break;
            case 3:
                if (dia >= 21 && dia<32) {
                    System.out.println("aries");
                } else if (dia >=1 && dia<21){
                    System.out.println("piscis");
                }
                break;

            case 4:
                if (dia >= 21 && dia<32) {
                    System.out.println("tauro");
                } else if (dia >=1 && dia<21){
                    System.out.println("aries");
                }
                break;
            case 5:
                if (dia >= 21  && dia<32) {
                    System.out.println("geminis");
                } else if (dia >=1 && dia<21){
                    System.out.println("tauro");
                }
                break;
            case 6:
                if (dia >= 21 && dia<32) {
                    System.out.println("cancer ");
                } else if (dia >=1 && dia<21){
                    System.out.println("geminis");
                }
                break;
            case 7:
                if (dia >= 21 && dia<32) {
                    System.out.println("leo");
                } else if (dia >=1 && dia<21){
                    System.out.println("cancer");
                }
                break;
            case 8:
                if (dia >= 21 && dia<32) {
                    System.out.println("virgo");
                } else if (dia >=1 && dia<21){
                    System.out.println("leo");
                }
                break;
            case 9:
                if (dia >= 21 && dia<32) {
                    System.out.println("libra");
                } else if (dia >=1 && dia<21){
                    System.out.println("virgo");
                }
                break;
            case 10:
                if (dia >= 21 && dia<32) {
                    System.out.println("escopion");
                } else if (dia >=1 && dia<21){
                    System.out.println("libra");
                }
                break;
            case 11:
                if (dia >= 21 && dia<32) {
                    System.out.println("sagitario");
                } else if (dia >=1 && dia<21){
                    System.out.println("escorpion");
                }
                break;
            case 12:
                if (dia >= 21 && dia<32) {
                    System.out.println("capricornio");
                } else if (dia >=1 && dia<21){
                    System.out.println("sagitario");
                }
                break;       
        }
            
    }
}
