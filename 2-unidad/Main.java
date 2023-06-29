
package pkg5ejemplosdoforwhile;


public class Main {

  
    public static void main(String[] args) {
        System.out.println("numeros del 1 al 100 con while");
        int i=1;
        while(i <= 100){
        System.out.println(i);
        i++;

    }
        System.out.println("numeros del 1 al 100 con Do");
        int j=1;
        do{
            System.out.println(j);
            j++;
        } while ( j <= 100);
        System.out.println("numeros del 1 al 100 con for");
        for( int k=1; k <= 100; k++){
            System.out.println(k);
        }
    }   
}
