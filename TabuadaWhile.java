package javaLista08;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        sc.close();
    }
}