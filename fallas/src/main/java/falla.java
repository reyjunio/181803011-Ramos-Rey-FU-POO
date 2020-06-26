
import java.time.LocalDate;


public class falla {
    int idFalla;
    LocalDate fechaInicio;
    LocalDate fechaSolucion;
    LocalDate fechaTermino;
    empleado empleado;
    maquina maquina;

    public falla() {
    }

    public falla(int idFalla, LocalDate fechaInicio, LocalDate fechaSolucion, LocalDate fechaTermino, empleado empleado, maquina maquina) {
        this.idFalla = idFalla;
        this.fechaInicio = fechaInicio;
        this.fechaSolucion = fechaSolucion;

        this.empleado = empleado;
        this.maquina = maquina;
    }

    public falla(int idFalla, LocalDate fechaInicio, LocalDate fechaTermino, empleado empleado, maquina maquina) {
        this.idFalla = idFalla;
        this.fechaInicio = fechaInicio;

        this.empleado = empleado;
        this.maquina = maquina;
    }
    
    public void terminarFalla(){
        this.fechaTermino=LocalDate.now();
    }
    
   // public boolean isVigente(){
        
    //}

    @Override
    public String toString() {
        return "falla{" + "idFalla=" + idFalla + ", fechaInicio=" + fechaInicio + ", fechaSolucion=" + fechaSolucion + ", fechaTermino=" + fechaTermino + ", empleado=" + empleado + ", maquina=" + maquina + '}';
    }
    
    
    
}
