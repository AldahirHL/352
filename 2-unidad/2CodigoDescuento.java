package pkg2.pkg2codigodescuento;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Obtener el precio del producto.
        
        System.out.println("Introduce el precio del producto:");
        String precio = scanner.nextLine();
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("Introduce el código de descuento:");
        String códigodescuento = scanner.nextLine();
        
       // Calcular el descuento.
        double descuento = 0;
        switch (códigodescuento) {
            case "A123":
                descuento = 10;
                break;
            case "B456":
                descuento = 20;
                break;
            case "C789":
                descuento = 30;
                break;
            default:
                System.out.println("Código de descuento no válido.");
        }
        // Imprime el descuento.
        System.out.println("el descuento es del: " + descuento + "%.");
        
    }
    
}
