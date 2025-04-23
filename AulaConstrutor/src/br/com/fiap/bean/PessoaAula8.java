package br.com.fiap.bean;

public class PessoaAula8 {
    //atributos encapsulados
    private String nome;
    private int anoNascimento;

    //construtores vazio - mesmo nome da classe Pessoa
    //comando generate -> constructor -> select none
    public PessoaAula8() {
    }

    //construtorescom parametro
    //comando generate -> constructor -> selecionar os atributos
    public PessoaAula8(String nome, int anoNascimento) {
        //atributo = variavel
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    //métodos getter e setters - pq atributos estão encapsulados
    //comando generate -> getter and setter -> selecionar os atributos
    //setter void sem retorno colocar valor nele?
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //metodos da classe (metodo particular da classe)
    public int calucularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}
