
public class Tarjeta {

    int noCuenta;
    int nip;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;

    public Tarjeta() {
    }

    public Tarjeta(int noCuenta, int nip, String nombre, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;
    }

    public double Total() {
        return this.monto + this.apartado;
    }

    //1 public no sabemos 
    //2 que tipo voya regresar  en este caso voy a regresar un objeto de tipo tarjeta
    //3 es el nombre
    //4 los valores que recube el metodo
    public Tarjeta verificarTarjeta(int nCuenta, int nip) {
        if (nCuenta == 123123 && nip == 1133) {

            return new Tarjeta(123123, 1133, "Eduardo Diaz Flores", 31, 12, 2032, 543, 45987.22, 550);

        } else if (nCuenta == 456789 && nip == 3367) {

            return new Tarjeta(456789, 3367, "Kevin Mesa Gonzales", 31, 12, 2032, 544, 360, 5322.23);

        } else {
            return new Tarjeta();
        }
    }

    public void deposito(double monto) {
        this.monto += monto;

    }

    public void retirar(double monto) {
        if (monto <= this.monto) {
            this.monto -= monto;
        }
    }

    
    //metodo eliminar apartado
    public void eliminarApartado(){
        
        this.monto = this.monto+this.apartado;
        this.apartado=this.apartado-this.apartado;
        
    }
    //Metodo crear apartado
    public void crearapartado(double apartado) {
        if (apartado <= this.monto){
        this.monto = this.monto - apartado;
        this.apartado = this.apartado + apartado;
        } 
    }

    @Override
    public String toString() {
        return " noCuenta=" + noCuenta + "\n nombre=" + nombre + "\n Fecha Vencimiento=" + dia + "/"
                + mes + "/" + anio + "\n cv=" + cv + "\n monto=" + monto + "\n apartado=" + apartado + "\n Total " + this.Total();
    }

}
