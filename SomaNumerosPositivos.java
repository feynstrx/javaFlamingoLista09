package javaLista08;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números positivos. Digite um número negativo para parar.");

        while (true) {
            numero = sc.nextInt();
            if (numero < 0) break;
            soma += numero;
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}