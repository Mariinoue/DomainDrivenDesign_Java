package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;

    public Gestante() {
    }

    public Gestante(LocalDate dataDaGestacao, String nome) {
        setDataDaGestacao(dataDaGestacao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate hoje = LocalDate.now();
        LocalDate semanaGestacional = hoje.minusWeeks(40);

        try{
            if(dataDaGestacao.isAfter(semanaGestacional) && dataDaGestacao.isBefore(hoje)){
                this.dataDaGestacao = dataDaGestacao;
            }else{
                throw new Exception("Data fora da faixa permitida");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public int tempoDeGetacao(){
        //método tempoDeGestacao() deve calcular e retornar o tempo da gestação em meses.
        LocalDate dataAtual = LocalDate.now();
        Period gestacaoEmMeses = Period.between(dataDaGestacao, dataAtual);
        return gestacaoEmMeses.getMonths();

    }
}
