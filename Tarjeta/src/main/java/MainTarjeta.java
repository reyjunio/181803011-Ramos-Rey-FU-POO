
import java.util.Scanner;

public class MainTarjeta {

    public static void main(String[] args) {
        //declarando al programa que usare un objeto de tipo tarjeta
        Tarjeta tarjeta;

        Scanner scan = new Scanner(System.in);

        int nCuenta, nip, opcion;
        double monto;
        System.out.println("Numero de cuenta : ");
        nCuenta = scan.nextInt();
        System.out.println("Nip : ");
        nip = scan.nextInt();

        //al mismo tiempo que estoy instanciando estoy mandando a llamar al metodo verificarcuenta
        tarjeta = new Tarjeta().verificarTarjeta(nCuenta, nip);

        //System.out.println("Tu nombre es : " + tarjeta.nombre);
        do {
            System.out.println("1-Hacer Deposito");
            System.out.println("2-Hacer un Retiro");
            if (tarjeta.apartado > 0) {
                System.out.println("3-Eliminar apartado");
            } else {
                System.out.println("3-Crear apartado");
            } 
            System.out.println("4-Imprimir datos de la Cuenta");
            System.out.println("5-Salir");
            System.out.print("Elige la Opcion: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cantidad a Depositar: ");
                    
                    monto = scan.nextDouble();
                    tarjeta.deposito(monto);
                    break;
                case 2:
                    System.out.println("Cantidad a Retirar: ");
                    monto = scan.nextDouble();
                    tarjeta.retirar(monto);
                    break;
                case 3:
                    if (tarjeta.apartado > 0) {
                        tarjeta.eliminarApartado();
                        System.out.println("Apartado Eliminado \n");
                    } else if (tarjeta.apartado == 0) {
                        System.out.println("Cuanto quiere apartar \n");
                        tarjeta.crearapartado(scan.nextDouble());
                    } 
                    break;
                case 4:
                    System.out.println(tarjeta.toString() + "\n");
                    break;
            }

        } while (opcion != 5);

    }

}
