package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Jamile");
        func.setValorHoraTrabalho(55.75f);
        LocalDate dataAtual  = LocalDate.now();
        System.out.printf("Data: %d/%s/%d\nNome: %s\nSálario: R$ %.2f",dataAtual.getDayOfMonth(), dataAtual.getMonthValue(),dataAtual.getYear(),func.getNome(),func.calcularSalario(40.0f));

    }
}
