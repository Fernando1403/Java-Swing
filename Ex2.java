import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo Swing");

        JButton botao = new JButton("Botao");

        janela.setLayout(new FlowLayout());

        janela.add(new JLabel("Insira seu texto: "));
        JTextField texto = new JTextField(40);
        janela.add(texto);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(botao, texto.getText());
            }
        });
        janela.add(botao);

        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
