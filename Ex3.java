import javax.swing.*;
import java.awt.*;

public class Ex3 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo Swing");

        JButton botao = new JButton("Botao");

        JLabel label = new JLabel("Texto inicial");

        janela.setLayout(new FlowLayout());
        janela.add(botao);
        janela.add(label);

        botao.addActionListener(e -> label.setText("Texto alterado!"));

        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
