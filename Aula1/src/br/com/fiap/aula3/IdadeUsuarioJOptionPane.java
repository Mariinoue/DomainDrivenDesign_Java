package br.com.fiap.aula3;

import javax.swing.*;

public class IdadeUsuarioJOptionPane {
    public static void main(String[] args) {
        int  anoAtual, anoNascimento, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento");
            anoNascimento = Integer.parseInt(auxiliar);
            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato incorreto");
        }
    }
}
