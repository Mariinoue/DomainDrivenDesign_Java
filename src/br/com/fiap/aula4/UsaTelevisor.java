package br.com.fiap.aula4;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.volume = 5;
        televisor.canal = 7;
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.trocarCanal(5);
        televisor.diminuirVolume();

        System.out.println("Volume atual: " + televisor.volume + "\nCanal atual: " + televisor.canal);
    }
}
