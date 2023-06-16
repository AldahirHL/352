package pkg12.banderacalificacion;

import java.util.Scanner;
public class BanderaCalificacion {

    
    public static void main(String[] args) {
        
         Scanner Scanner = new Scanner (System.in);
       
         int cali= 7;
         int calificacion= 10;
         
         boolean cal1;

         System.out.println("Ingresa tu calificacaión:");
         cali = Scanner.nextInt();
         cal1 =( cali>=7 && calificacion<=10 );
         System.out.println("Aprobado:" + cal1);
         
         System.out.println("");
         
         boolean cal2;
         
         System.out.println("Ingresa tu calificacaión");
         cali = Scanner.nextInt();
         cal2 =( cali>=7 && calificacion<=10 );
         System.out.println("Aprobado:" + cal2);
         
         System.out.println("");
         
         boolean cal3;

         System.out.println("Ingresa tu calificacaión");
         cali = Scanner.nextInt();
          cal3 =( cali>=7 && calificacion<=10 );
         System.out.println("Aprobado:" + cal3);
         
         System.out.println("");
         
         boolean cal4;

         System.out.println("Ingresa tu calificacaión");
         cali = Scanner.nextInt();
          cal4 =( cali>=7 && calificacion<=10 );
         System.out.println("Aprobado:" + cal4);
         
         System.out.println("");
         
         boolean cal5;
         
         System.out.println("Ingresa tu calificacaión");
         cali = Scanner.nextInt();
         cal5 =( cali>=7 && calificacion<=10 );
         System.out.println("Aprobado:" + cal5);
        
    }
    
}