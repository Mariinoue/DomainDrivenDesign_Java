package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class MainFunc2 {
    public static void main(String[] args) {
        Funcionario funcionario1;
        Scanner scan;
        LocalDate dataAtual = LocalDate.now();
        float horaDaSemana;

        try{
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e valor hora de trabalho:");
            funcionario1 = new Funcionario(scan.nextLine(),scan.nextFloat());

            System.out.println("Quantas horas trabalha por semana?");
            horaDaSemana = scan.nextFloat();

            System.out.printf("Data: %d/%s/%d\nNome: %s\nSálario: R$ %.2f",dataAtual.getDayOfMonth(), dataAtual.getMonthValue(),dataAtual.getYear(),funcionario1.getNome(),funcionario1.calcularSalario(horaDaSemana));

        } catch (Exception e) {
            System.out.println("Nome ou valor da hora inválido(s)!");
        }
    }
}
