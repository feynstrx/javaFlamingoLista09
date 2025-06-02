package javaLista08;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int count = 0;
        int nota;

        while (true) {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) break;

            soma += nota;
            count++;
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        sc.close();
    }
}
