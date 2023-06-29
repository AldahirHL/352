package pkg10doacumulador;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num, suma;
        suma = 0;
        do{
            System.out.println(" introduce el numero ");
            num = entrada.nextInt();
            suma = suma + num;
           
        }while(num!=0);
        System.out.println(" la suma de todos es " + suma);
    }
    
}
