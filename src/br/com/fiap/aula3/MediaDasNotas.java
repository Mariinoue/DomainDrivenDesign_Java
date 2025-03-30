package br.com.fiap.aula3;

import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args) {
        float num1, num2, num3, num4, media;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.print("Digite sua nota da prova 1 ");
            num1 = scan.nextFloat();

            System.out.print("Digite sua nota da prova 2 ");
            num2 = scan.nextFloat();

            System.out.print("Digite sua nota da prova 3 ");
            num3 = scan.nextFloat();

            System.out.print("Digite sua nota da prova 4 ");
            num4 = scan.nextFloat();

            media = (num1 + num2 + num3 + num4)/4;

            System.out.println("Prova 1: " + num1 + "\nProva 2: " + num2 + "\nProva 3: " + num3 + "\nProva 4: " + num4 + "\nA média das notas é : " + media);

        } catch (RuntimeException e) {
            System.out.println("Formato da resposta incorreta");
        }

    }
}
