package javaLista08;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String senhaCorreta = "java123";
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.next();
        } while (!senha.equals(senhaCorreta));

        System.out.println("Acesso permitido.");
        sc.close();
    }
}