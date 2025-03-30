package br.com.fiap.aula4;

public class UsaRadio {
    public static void main(String[] args) {
        //Radio radio; //declaração
        //radio = new Radio(); //instanciação do objeto
        Radio radio = new Radio();
        radio.estacao = 89.1f;
        radio.volume = 5;
        radio.trocarEstacao(92.5f);
        radio.aumentarVolume();
        radio.aumentarVolume();

        System.out.println("Volume atual: " + radio.volume + "\nEstação atual: " + radio.estacao);
    }
}
