package br.com.fiap.aula3;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        double raio, pi = 3.14, areaTotal;
        Scanner scan;

        try{
            scan = new Scanner(System.in);

            System.out.print("Digite o raio do circulo");
            raio = scan.nextInt();

            areaTotal = pi * (raio * 3);

            System.out.println("Area Total: " + areaTotal );

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
