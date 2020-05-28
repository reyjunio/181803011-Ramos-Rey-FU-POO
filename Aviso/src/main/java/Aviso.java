
public class Aviso {

    String matricula;
    String titulo;
    String textoAviso;
    String resumenAviso;
    String nombrePersona;
    String fechaPublicacion;
    String fechaAlta;
    String fechaBaja;
    String status;
    String tipoAviso;
    
    public void cambiarStatus() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Aviso{" + "matricula=" + matricula + ", titulo=" + titulo + ", textoAviso=" + textoAviso + ", resumenAviso=" + resumenAviso+ ", nombrePersona=" + nombrePersona + ", fechaPublicacion=" + fechaPublicacion + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + ", status=" + status + ", tipoAviso=" + tipoAviso + '}';
    }
    
    

}
