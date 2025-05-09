import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class ExemploSwing {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo Swing");

        JButton botao1 = new JButton("Fazer");
        JButton botao2 = new JButton("Desfazer");
        JButton buttonFunc = new JButton("Botao Func");
        buttonFunc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(buttonFunc, "Botao function clicado "+ buttonFunc.getText());
            }
        });

        JLabel label = new JLabel("Texto inicial");

        JTextField txtNome = new JPasswordField(50);
        janela.add(txtNome);

        JButton buttonFunc2 = new JButton("Botao Func");
        buttonFunc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(buttonFunc2, "Botao function clicado "+ txtNome.getText());
            }
        });

        janela.setLayout(new FlowLayout());
        janela.add(botao1);
        janela.add(botao2);
        janela.add(buttonFunc);
        janela.add(buttonFunc2);
        janela.add(label);

        botao1.addActionListener(e -> label.setText("Botao clicado"));
        botao2.addActionListener(e -> label.setText("Texto inicial"));

        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
