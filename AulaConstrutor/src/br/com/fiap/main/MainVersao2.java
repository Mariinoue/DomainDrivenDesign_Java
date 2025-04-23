package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {
        //interação usuario digitar seu nome e ano de nascimento
        //pode usar o construtor vazio ou cpm parametro

        Pessoa pessoa1; //só vou declarar nesse momneto o objeto da classe Pessoa
        Scanner scan; //só vou declarar nesse momneto o objeto da classe Scanner
        String nome; //criar variavel de apoio
        int anoNascimento; //criar variavel de apoio

        //interação usuario sempre usar o try e catch
        try {
            //instancia o objeto da classe Scanner
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e seu ano de nascimento");
            nome = scan.next(); //metodo next premite ler uma única palavra
            //nome = scan.nextLine();// metodo nextLine ler uma linha inteira de string
            anoNascimento = scan.nextInt();

            //valores que foram digitados pelo usuario
            pessoa1 = new Pessoa(nome, anoNascimento);
            //variavel calcular idade
            int idadePessoa1 = pessoa1.calucularIdade(2025);

            System.out.printf("Pessoa 1 \nNome %s \nIdade %d anos", pessoa1.getNome(), idadePessoa1);

        } catch (Exception e) {
            System.out.println("Nome ou ano nascimento inválido(s)");
        }
    }
}
