package br.com.fiap.aula4;

public class UsaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nome = "Filó";
        animal.especie = "cachorro";
        animal.ditanciaPasseio = 1;
        animal.posicao = "deitada";
        animal.passear();
        animal.passear();
        animal.mudarPoiscao("em pé");
        animal.mudarPoiscao("sentada");
        System.out.println("A " + animal.nome + " é um " + animal.especie + "\nE ela hoje fez um passeio de " + animal.ditanciaPasseio + " km " + "\nMas agora está " + animal.posicao);
    }
}
