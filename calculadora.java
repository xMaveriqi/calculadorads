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

private void tratarClique(String comando){
            if("0123456789".contains(comando)){
                if (novoNumero){
                    visorAtual.setText(comando);
                    novoNumero = false;
                } else{
                    visorAtual.setText(visorAtual.getText() + comando);
                }
            } else if ("+-*/=".contains(comando)) {
                calcular(Double.parseDouble(visorAtual.getText()));
                if (comando.equals("=")){
                    visorEquacao.setText(visorEquacao.getText() + visorAtual.getText() + " =");
                    visorAtual.setText(String.valueOf(resultado));
                    resultado = 0;
                    operadorPendente = "+";
                } else{
                    visorEquacao.setText(visorEquacao.getText() + visorAtual.getText() + "" + comando + "");
                    visorAtual.setText(String.valueOf(resultado));
                } 
                novoNumero = true;
            } else if (comando.equals("C")){
                resultado = 0;
                operadorPendente = "+";
                visorAtual.setText("0");
                visorEquacao.setText(" ");
            }
                
            }
            private void calcular(double valor){
                if (operadorPendente.equals( "+")) {
                    resultado += valor;
                } else if (operadorPendente.equals( "-")) {
                    resultado -= valor;
                }else if (operadorPendente.equals( "*")) {
                    resultado *= valor;
                }else if (operadorPendente.equals( "/")) {
                    resultado /= valor;
            }
        }
}
        
    }
}
