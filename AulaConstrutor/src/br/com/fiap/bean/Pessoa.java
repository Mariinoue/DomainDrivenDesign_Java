package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    //atributos encapsulados
    private String nome;
    private int anoNascimento;

    //construtores vazio - mesmo nome da classe Pessoa
    //comando generate -> constructor -> select none
    public Pessoa() {
    }

    //construtorescom parametro
    //comando generate -> constructor -> selecionar os atributos
    public Pessoa(String nome, int anoNascimento) {
        //atributo = variavel
        this.nome = nome;
        //se tem regra de negocio colocar o setter atribuir valor anoNascimento via metodo setter
        setAnoNascimento(anoNascimento);
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

    //adionar regra de negócio
    public void setAnoNascimento(int anoNascimento) {
        //criar objeto da classe Local Date
        LocalDate dataAtual = LocalDate.now(); //yyyy/mm/dd atual
        try {
            if ( anoNascimento >= 1900 && anoNascimento <= dataAtual.getYear()){
                //se a condição for verdadeira excuta
                this.anoNascimento = anoNascimento;
            }else {
               throw new Exception("Valor inválido!(min=1900  até max= Ano Atual");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //pulo do gato cuidado


    //metodos da classe (metodo particular da classe)
    public int calucularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}
