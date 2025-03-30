package br.com.fiap.aula3;

import javax.swing.*;

public class MediaNotasJOptionPane {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite sua nota da prova 1");
            p1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite sua nota da prova 2");
            p2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite sua nota da prova 3");
            p3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite sua nota da prova 4");
            p4= Float.parseFloat(auxiliar);
            media = (p1 + p2 + p3 + p4) / 4;
            JOptionPane.showMessageDialog(null, "Sua média é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato incorreto");
        }
    }
}
