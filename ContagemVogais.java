package javaLista08;
import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next().toLowerCase();

        int i = 0;
        int vogais = 0;

        while (i < palavra.length()) {
            char c = palavra.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            }
            i++;
        }

        System.out.println("Quantidade de vogais: " + vogais);
        sc.close();
    }
}