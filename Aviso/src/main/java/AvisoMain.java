
public class AvisoMain {
    public static void main(String[] args) {
        
        
        Aviso aviso1 = new Aviso();
        
        aviso1.matricula="Aviso1";
        aviso1.titulo="Insumos y bienes muebles de laboratorio disponibles";
        aviso1.nombrePersona="Eduardo Flores Díaz";
        aviso1.textoAviso="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.";
        aviso1.resumenAviso="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
        aviso1.fechaPublicacion="02/02/2020";
        aviso1.fechaAlta="02/02/2020";
        aviso1.fechaBaja="02/02/2021";
        aviso1.status="Vigente";
        aviso1.tipoAviso="General";
        
        System.out.println(aviso1.toString());
        
        Aviso aviso2 = new Aviso();
        
        aviso2.matricula="Aviso2";
        aviso2.titulo="CONFERENCIA DR. COSSARIZZA";
        aviso2.nombrePersona="Kevin Meza Gonzalez";
        aviso2.textoAviso="El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia "
                + "“Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores "
                + "y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados,"
                + " sobre VIH y el uso de citometría de flujo.Además, invitó a nuestra comunidad a agregarse a la "
                + "sociedad internacional sobre citometría: ISAC(International Society for the Advancement of "
                + "Cytometry) y aprovechar los recursos que tienen como:Programa de Liderazgo MARYLOU INGRAM "
                + "SCHOLARS PROGRAM, de 5 años para formación de citomteristas Iniciativa de innovación CYTO-Innovation "
                + "apoya a las propuestas innovadoras que contemplan la conversión de ideas";
        aviso2.resumenAviso="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\"";
        aviso2.fechaPublicacion="02/03/2020";
        aviso2.fechaAlta="15/02/2020";
        aviso2.fechaBaja="31/03/2020";
        aviso2.status="No Vigente";
        aviso2.tipoAviso="Conferencia";
        
        System.out.println(aviso2.toString());
    }
    
}
