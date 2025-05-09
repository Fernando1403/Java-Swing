import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Cadastro {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo Swing");
        janela.setSize(new Dimension(640,480));

        janela.setLayout(new FlowLayout());

        janela.add(new JLabel("User"));
        JTextField txtUser = new JTextField(40);
        janela.add(txtUser);

        janela.add(new JLabel("Senha"));
        JPasswordField txtSenha = new JPasswordField(40);
        janela.add(txtSenha);

        JCheckBox checkBox1 = new JCheckBox("Opção 1");
        JCheckBox checkBox2 = new JCheckBox("Opção 2");

        janela.add(checkBox1);
        janela.add(checkBox2);

        JButton buttonUm = new JButton("Login");
        buttonUm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(buttonUm, txtUser.getText() + " - " + txtSenha.getPassword());
            }
        });

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
