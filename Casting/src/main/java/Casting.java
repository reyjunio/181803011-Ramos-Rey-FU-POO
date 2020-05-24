/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riskys
 */
public class Casting {
    public static void main(String[] args) {
        
        
        //casting Explicito
        short a=1;
        int b=15;
        
        a=(short)b;
        
        
        //casting implicito
        
        float c=4.5f;
        
        double d=5.6;
        
        d=c;
        
        //k pasa con los decimales cuaando casteo de flotante a double  a entero
        
        double pi=3.5416;
        int duda = (int)pi;
        
        System.out.println("imprime valor duda: "+duda);
        
        //Integer.valueOf
        
        String valor= "15";
        
        int n =Integer.parseInt(valor);
        n = n + duda;
        System.out.println("ressultado "+n);
        
        //ciclo for
        
      
        for(int i=0;i<10;i++){
            System.out.println(i);
        
        }
        
        int j=1;
        while(j<10){
            System.out.println(j);
            j++;
        }
        
        do{
            
        }while()
    }
    //se reuiere un programa que dao el dia de nacimiento y el mes de nacimiento determine cual es su horoscopo
    //realize un programa par adivinr un numero el usuario ingresara un numero y el progrm entre i e el numero 
    //i e adivinado est bajo o por debajo a adivinr
}
