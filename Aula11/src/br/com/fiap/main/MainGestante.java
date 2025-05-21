package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gestante1;
        LocalDate dataInicioGestacao;
        String auxiliar, nome, dataEUA;

        try {
            nome = JOptionPane.showInputDialog("Informe seu nome: ").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Informe a data início da gestação (dd-mm-yyyy): ");
            String ano = auxiliar.substring(6,10);
            String mes = auxiliar.substring(3,5);
            String dia = auxiliar.substring(0,2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataInicioGestacao = LocalDate.parse(dataEUA);

            gestante1 = new Gestante(dataInicioGestacao,nome);
            

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
