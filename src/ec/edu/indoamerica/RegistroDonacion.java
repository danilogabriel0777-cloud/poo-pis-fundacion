package ec.edu.indoamerica;
/**
 * Práctica Modular M1S2 - Programa de prueba inicial.
 *
 * @author Danilo Ramos
 * @fecha 12/10/2026
 */
import java.util.Scanner;

public class RegistroDonacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Donaciones");

        System.out.print("Nombre del donante: ");
        String donante = scanner.nextLine();

        System.out.print("Producto donado: ");
        String producto = scanner.nextLine();

        System.out.print("Cantidad (unidades): ");
        int cantidad = scanner.nextInt();

        System.out.print("Valor unitario estimado (USD): ");
        double valorUnitario = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Fecha de donación (ej. 12/10/2026): ");
        String fecha = scanner.nextLine();

        double valorTotal = cantidad * valorUnitario;

        System.out.println("------------------------------------");
        System.out.println("Donante : " + donante);
        System.out.println("Producto: " + producto + " (" + cantidad + " unidades)");
        System.out.println("Fecha   : " + fecha);
        System.out.println("Valor total estimado: $" + valorTotal);
        System.out.println("------------------------------------");

        scanner.close();
    }
}