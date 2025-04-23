package br.com.fiap.aula4;

public class UsaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.temperatura = 21;
        arCondicionado.modo = "Frio";
        arCondicionado.diminuirTemperatura();
        arCondicionado.diminuirTemperatura();
        arCondicionado.trocarModo("Congelante");

        System.out.println("Temperatura: " + arCondicionado.temperatura + "\nModo atual: " + arCondicionado.modo);
    }

}
