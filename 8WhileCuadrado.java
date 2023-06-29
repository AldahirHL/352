
package pkg8whilecuadrado;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num,cuadrado;
        
        System.out.println(" introduzca el numero ");
        num = entrada.nextInt();
        while(num >= 0 ){
            cuadrado = num * num;
            System.out.println(" el cuadrado de " + num + " es igual a " + cuadrado);
            
            System.out.println("");
            System.out.println(" introduzca el otro numero ");
            num = entrada.nextInt();
        }
        
    }
    
}
