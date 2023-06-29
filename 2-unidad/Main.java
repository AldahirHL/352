package pkg9whilemedia;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println(" intraduzca un numero ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while (num >= 0 ){
            suma += num;
            elementos ++;
            
            System.out.println(" introduce otro numero ");
            num = entrada.nextInt();
                
            }
                 media = (float)suma/elementos;
                System.out.println(" la media es de " + media);
        }
        
    }
    

