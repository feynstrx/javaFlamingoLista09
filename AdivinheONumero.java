package javaLista08;

import java.util.Scanner;
import java.util.Random;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativa;

        System.out.println("Tente adivinhar o número entre 1 e 10!");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = sc.nextInt();
        } while (tentativa != numeroSecreto);

        System.out.println("Parabéns! Você acertou.");
        sc.close();
    }
}