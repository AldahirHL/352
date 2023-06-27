
package codigosmenu;

import java.util.Scanner;

public class CodigosMenu {

  
    public static void main(String[] args) {
        int opcion;
      Scanner entrada = new Scanner (System.in);
        
       System.out.println("1. Banderas");
        System.out.println("2. banderaCalificacion");
        System.out.println("3. switchCajero");
        System.out.println("4. Salir");
        
        System.out.println("Ingresar un numero");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1:
                int edadJuan= 22;
        int edadPedro= 20;
        
        boolean bandera1;
        
        bandera1=(edadJuan > edadPedro);
        System.out.println("resultado de bandera1:" + bandera1);
        
        int edadLupe= 35;
         
         boolean bandera2;
         boolean bandera3;
         
         bandera2=(edadLupe < edadPedro);
           System.out.println("Resultado de bandera2:" + bandera2);
         bandera3=(bandera1 && bandera2);
         System.out.println("Resultado de bandera3:" + bandera3);
         
         break;
            case 2:
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
         break;
            case 3:
                final int saldo_inicial=1000;
        int option;
        double ingreso,saldoActual,retiro;

        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta");
        System.out.println("3. Salir");
        
        System.out.println("Ingresar un numero");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Digite la cantidad que desea ingresar");
                ingreso=entrada.nextInt();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("El esatdo actual es: " + saldoActual);
                break;
            case 2:
                System.out.println("Digite la cantidad que desea retirar");
                retiro=entrada.nextInt();
                if(retiro<=saldo_inicial){
                saldoActual=saldo_inicial-retiro;
                    System.out.println("Dinero en cuenta: " + saldoActual);
                } 
                else{
                     System.out.println("No cuenta con el");
                }
                break;
             
        }
      
    }
    
    }
}

