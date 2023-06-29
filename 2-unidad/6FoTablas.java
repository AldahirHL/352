
package pkg6fortablas;


public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,j;
        for (i=1; i <= 10; i++){
            System.out.println(" tabla del " + i);
            System.out.println(" ---------------- ");
            
            for ( j=1; j <= 10; j++){
                System.out.println( i + "x" + j + " = " + j*i);
            }
        }
    }
    
}
