package facturas;

import java.util.Scanner;

public class Facturas {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        // Declarar variables para almacenar el número de factura, código de producto, cantidad y precio por litro
        int númerofactura;
        int códigoproducto = 0;
        int cantidad = 0;
        float precio_por_litro;
        // Iterar 5 veces para crear 5 facturas
        for (int i = 0; i < 5; i++) {
            // Imprime el número de factura
            System.out.println("número de factura: " + (i + 1));
            // Obtener el código del producto del usuario
            System.out.println("Código de producto: ");
            códigoproducto = scanner.nextInt();
            // Obtener la cantidad del usuario
            System.out.println("Cantidad: ");
            cantidad = scanner.nextInt();
            // Obtener el precio por litro del usuario
            System.out.println("precio por litro: ");
            precio_por_litro = scanner.nextFloat();
            
// Calcular el costo total de la factura
            float costetotal = cantidad * precio_por_litro;
            // Imprime el costo total de la factura
            System.out.println("Coste total: " + costetotal);
        }
       // Calcular la cantidad total de facturas capturadas
        int facturastotales = 5;
        // Calcular cuantos litros del producto 1 se compraron
        int producto1Litros = 0;
        for (int i = 0; i < 5; i++) {
            if (códigoproducto == 1) {
                producto1Litros += cantidad;
            }
        }
       
// Calcular el número de facturas mayores a 10 mil pesos
        int facturasMás_de_10k = 0;
        float costetotal = 0;
        for (int i = 0; i < 5; i++) {
            if (costetotal > 10000) {
                facturasMás_de_10k++;
            }
        }
        // Calcular el valor máximo de las facturas
        float MaxFactura = 0;
        for (int i = 0; i< 5; i++) {
            if (costetotal > MaxFactura) {
               MaxFactura = costetotal;
            }
        }
        
// Calcular el valor mínimo de las facturas
        float minFactura = 0;
        for (int i = 0; i < 5; i++) {
            if (costetotal < minFactura) {
                minFactura = costetotal;
            }
        }
        // Print the sales summary
        System.out.println("Monto total de facturas capturadas: " + facturastotales);
        System.out.println("¿Cuántos litros del producto 1 se compraron?: " + producto1Litros);
        System.out.println("Número de facturas mayores a 10 mil pesos: " + facturasMás_de_10k);
        System.out.println("Valor máximo de las facturas: " + MaxFactura);
        System.out.println("Valor mínimo de las facturas: " + minFactura);
        
    }
    
}
