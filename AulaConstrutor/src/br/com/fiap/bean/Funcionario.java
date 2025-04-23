package br.com.fiap.bean;

public class Funcionario {
    private String nome;
    private float valorHoraTrabalho;

    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        setValorHoraTrabalho(valorHoraTrabalho);
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try {
            if (valorHoraTrabalho >= 0){
                this.valorHoraTrabalho = valorHoraTrabalho;
            }else{
                throw new RuntimeException("Valor da hora de trabalho inválido, pois não pode ser 0 reais");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public float calcularSalario(float qtdeHorasTrabalhadasSemana){
        return valorHoraTrabalho* qtdeHorasTrabalhadasSemana * 4;
    }
}
