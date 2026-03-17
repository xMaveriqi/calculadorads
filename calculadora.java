import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class calculadora {
    private JFrame janela;
private JTextField visorEquacao;
private JTextField visorAtual;




    public calculadora() {
       janela = new JFrame();

       janela.setSize(350, 450);
       janela.setTitle("calculadora");
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       visorEquacao = new JTextField();
       visorEquacao.setEditable(false);
       visorEquacao.setHorizontalAlignment(JTextField.RIGHT);

       visorAtual = new JTextField("0");
       visorAtual.setEditable(false);
       visorAtual.setHorizontalAlignment(JTextField.RIGHT);
       Font font = new Font("Arial", Font.BOLD,28);
visorAtual.setFont(font);

       JPanel painelValores = new JPanel(new GridLayout(2,1));
       painelValores.add(visorEquacao);
       painelValores.add(visorAtual);

janela.add(painelValores, BorderLayout.NORTH);
janela.setVisible(true);

    }
}