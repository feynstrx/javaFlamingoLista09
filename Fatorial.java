package javaLista08;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int resultado = 1;
        int i = 1;

        while (i <= numero) {
            resultado *= i;
            i++;
        }

        System.out.println("Fatorial de " + numero + " é: " + resultado);
        sc.close();
    }
}