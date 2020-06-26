
package Paquete2;

import Paquete1.*;


public class MainPaquete2 {
    public static void main(String[] args) {
        Publica publico = new Publica();
        publico.publico = "Soy un atributo publico";
        System.out.println(publico.publico);
        publico.metodoPublico();

        /*Default defaultobj = new Default();
        defaultobj.atributoDefault = "Soy un atributo Default";
        System.out.println(defaultobj.atributoDefault);
        defaultobj.metodoDefault();

        Protected protegido = new Protected();
        protegido.protegido = "Soy un metodo protegido";
        System.out.println(protegido.protegido);
        protegido.metodoProtegido();
        
        Privado privado = new Privado();
        privado.privado = "soy un atributo privado";
        System.out.println(privado.privado);
        privado.metodoPrivado();*/
    }   
}
