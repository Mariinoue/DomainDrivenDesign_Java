package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de mensagem \n(2) Pergunta \n(n3) Alerta \n (4) Erro\n"));
                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de Pergunta", "Pergunta", JOptionPane.QUESTION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de Informação", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de Alerta", "Alerta", JOptionPane.WARNING_MESSAGE);
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de Erro", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    default:
                        throw new Exception("Escolha incorreta");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre");

    }
}



