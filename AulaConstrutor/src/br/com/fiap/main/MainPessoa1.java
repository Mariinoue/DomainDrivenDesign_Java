package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class MainPessoa1 {
    public static void main(String[] args) {
        //decalaração do objeto = instaciação e cria um novo objeto
        //cria um novo objeto
        //nome classe Pessoa
        //nome objeto pessoa1
        //é o contrutor Pessoa();
        Pessoa pessoa1 = new Pessoa();
        //para acessar o objeto precisa quando o construtor é vazio metodo setNome e getNome
        pessoa1.setNome("Astrogilde");
        pessoa1.setAnoNascimento(1998);
        int idadePessoa1 = pessoa1.calucularIdade(2025);

        //criar um novo objeto pessoa 2 - já colocando valores no atributo
        //contruto com passagem de paramtro
        Pessoa pessoa2 = new Pessoa("Joao", 1998);

        System.out.printf("Pessoa 1 \nNome %s \nIdade %d anos", pessoa1.getNome(), idadePessoa1);
        System.out.printf("Pessoa 2 \nNome %s \nIdade %d anos", pessoa2.getNome(), pessoa2.calucularIdade(2025));

    }
}
