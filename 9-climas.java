
package pkg9.descdiasemana;

import java.util.Scanner;

public class DescDiaSemana {

    public static void main(String[] args) {
        Scanner input = new 
            Scanner (System.in);
        
        System.out.println(" Introduzca la temperatura ");
        int temperatura = input.nextInt();
         if (temperatura <=10){
             System.out.println(" el clima es frio ");
         }else if (temperatura <=20){
             System.out.println(" el clima es nublado");
         }else if (temperatura <=30){
             System.out.println(" el clima es caluroso");
         }else if (temperatura >30){
             System.out.println(" el clima es tropical");
             
         }

    }
    
}
