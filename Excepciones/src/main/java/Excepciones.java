
public class Excepciones {

    public static void main(String[] args) {
        int numerador;
        Integer denominador = null;
        float division;
        System.out.println("antes");

        numerador = 20;

        try {
            division = numerador / denominador;
        } catch (Exception e) {
            System.out.println(e);
            division = 0;
        } /*catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            division = 0;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            division = 0;
        }*/
        System.out.println(division);

        System.out.println("Despues");

    }

}
