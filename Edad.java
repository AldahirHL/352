package pkg7.determinaetapas;


import java.util.Scanner;
public class Edad {
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese su edad: ");
int edad = scanner.nextInt();
if (edad < 5) {
System.out.println("Es un infante.");
} else if (edad < 18) {
System.out.println("Es un niño.");
} else {
System.out.println("Es un adulto.");
}
}
}
