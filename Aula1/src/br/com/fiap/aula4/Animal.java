package br.com.fiap.aula4;

public class Animal {
    public String nome;
    public String especie;
    public String posicao;
    public int ditanciaPasseio;

    public void passear(){ditanciaPasseio++;};
    public void mudarPoiscao(String novaPosicao){posicao = novaPosicao;};
}
