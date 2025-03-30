package br.com.fiap.aula3;

import java.util.Scanner;

public class IdadeDoUsuario {
    public static void main(String[] args) {
        int anoNascimento, anoAtual, idade;
        Scanner scan;

        try{
            scan = new Scanner(System.in);

            System.out.print("Digite o ano corrente ");
            anoAtual = scan.nextInt();

            System.out.print("Digite o ano de nascimento ");
            anoNascimento = scan.nextInt();

            idade = anoNascimento - anoAtual;

            System.out.println("Ano de nascimento: " + anoNascimento + "\nAno Atual: " + anoAtual + "\nA sua idade atual é : " + idade + " anos");

        } catch (RuntimeException e) {
            System.out.println("Formato da resposta incorreta");
        }
    }
}
