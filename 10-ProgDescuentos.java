package pkg10.tipoclima;

import java.util.Scanner;

public class TipoClima {

  
    public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
       
        System.out.println("Introduce el importe de la compra: ");
        double precio = input.nextDouble();
        
        System.out.println("Introduzca el día de la semana: ");
        String diaSemana = input.next();
        
        double descuento = 0;
        if (diaSemana.equals("martes") || diaSemana.equals("jueves")) {
            descuento = precio * 0.15;
        
        }
        
        double cantidadTotal = precio - descuento;
        
        
        System.out.println("El descuento es $" + descuento);
        
        System.out.println("El monto total a pagar es $" + cantidadTotal);
        
       
    }
    
}