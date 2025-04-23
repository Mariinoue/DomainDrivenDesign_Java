package br.com.fiap.aula2;

public class Primitivo {
    public static void main(String[] args) {
        //declaração e inicialização de variáveis
        char sexo = 'F';
        byte idade= 35;
        short codigo = 15650;
        int alunos = 50, classes = 11;
        long brasileiros = 216455377500L;
        float media = 8.7f;
        double dolar = 5.68;
        boolean alternativa = false;
        String nomeCompleto = "Astrogildo Celeste";

        //println pula linha
        System.out.println("sexo: " + sexo + " Idade: " + idade + " Código: " + codigo);
        System.out.println("Média: " + media + " Alunos: " + alunos + " Turmas " + classes);
        System.out.println("Habitantes " + brasileiros + " Cotação do dólar U$ " + dolar);
        System.out.println("Alternativa: " + alternativa);
        System.out.println("Nome: " + nomeCompleto);

    }
}
