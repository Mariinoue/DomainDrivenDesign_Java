package br.com.fiap.aula3;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.14;
        Scanner scan;
        try{
            scan = new Scanner(System.in);
            System.out.print("Digite o valor do raio: ");
            raio = scan.nextDouble();
            area = PI * (raio * raio);
            System.out.print("Area Total: " + area);
        } catch (RuntimeException e) {
            System.out.println("Formato incorreto");
        }
    }
}
