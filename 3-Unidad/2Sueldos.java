package sueldos;

import java.util.Scanner;

public class Sueldos {

    public static void main(String[] args) {
        // TODO code application logic here
        
              Scanner entrada = new Scanner(System.in);
        int sueldos[] = new int[10];
        int suma = 0;
        int contador = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el salario de la empleada. " + (i + 1));
            sueldos[i] = entrada.nextInt();
            suma = suma + sueldos[i];
            
            if (sueldos[i] > 1000) {
                contador++;
            }
            if (sueldos[i] > mayor) {
                mayor = sueldos[i];
            }
            if (sueldos[i] < menor || menor == 0 ) {
                menor = sueldos[i];
            }
        }
        System.out.println("La suma de los salarios es: " + suma);
        System.out.println("Hay " + contador + " sueldos superiores a 100");
        System.out.println("El promedio de los salarios es: " + (suma / 10));
        System.out.println("El salario más alto es: " + mayor);
        System.out.println("El salario más bajo es: " + menor);
        
    }
    
}
