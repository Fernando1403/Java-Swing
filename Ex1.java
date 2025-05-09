import javax.swing.*;
import java.awt.*;

public class Ex1 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo Swing");

        JButton botao1 = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");

        JLabel label = new JLabel("Texto inicial");

        janela.setLayout(new FlowLayout());
        janela.add(botao1);
        janela.add(botao2);
        janela.add(label);

        botao1.addActionListener(e -> label.setText("Botao 1 clicado"));
        botao2.addActionListener(e -> label.setText("Botao 2 clicado"));

        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
