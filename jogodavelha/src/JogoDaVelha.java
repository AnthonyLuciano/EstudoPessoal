import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame implements ActionListener {
    private final JButton[][] botoes = new JButton[3][3];
    private char jogadorAtual = 'X';
    private int vitoriasX = 0;
    private int vitoriasO = 0;
    private final JLabel labelVitorias;

    public JogoDaVelha() {
        setTitle("Jogo da Velha");
        setSize(300, 350); // Aumentar a altura para acomodar o JLabel
        setLayout(new BorderLayout());

        // Label de contar vitórias
        labelVitorias = new JLabel("X: 0  O: 0", SwingConstants.CENTER);
        labelVitorias.setFont(new Font("Arial", Font.PLAIN, 20));
        add(labelVitorias, BorderLayout.NORTH);

        // painel pros botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(3, 3));

        // criador dos botoes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j] = new JButton("");
                botoes[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                botoes[i][j].setFocusPainted(false);
                botoes[i][j].addActionListener(this);
                painelBotoes.add(botoes[i][j]);
            }
        }

        add(painelBotoes, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton) e.getSource();
        if (botaoClicado.getText().isEmpty()) {
            botaoClicado.setText(String.valueOf(jogadorAtual));
            if (verificarVitoria()) {
                if (jogadorAtual == 'X') {
                    vitoriasX++;
                } else {
                    vitoriasO++;
                }
                atualizarLabelVitorias();
                JOptionPane.showMessageDialog(this, "Jogador " + jogadorAtual + " venceu!");
                reiniciarJogo();
            } else if (tabuleiroCheio()) {
                JOptionPane.showMessageDialog(this, "Empate!");
                reiniciarJogo();
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }

    private boolean verificarVitoria() {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (botoes[i][0].getText().equals(String.valueOf(jogadorAtual)) &&
                    botoes[i][1].getText().equals(String.valueOf(jogadorAtual)) &&
                    botoes[i][2].getText().equals(String.valueOf(jogadorAtual))) {
                return true;
            }
            if (botoes[0][i].getText().equals(String.valueOf(jogadorAtual)) &&
                    botoes[1][i].getText().equals(String.valueOf(jogadorAtual)) &&
                    botoes[2][i].getText().equals(String.valueOf(jogadorAtual))) {
                return true;
            }
        }
        // Verifica diagonais
        if (botoes[0][0].getText().equals(String.valueOf(jogadorAtual)) &&
                botoes[1][1].getText().equals(String.valueOf(jogadorAtual)) &&
                botoes[2][2].getText().equals(String.valueOf(jogadorAtual))) {
            return true;
        }
        return botoes[0][2].getText().equals(String.valueOf(jogadorAtual)) &&
                botoes[1][1].getText().equals(String.valueOf(jogadorAtual)) &&
                botoes[2][0].getText().equals(String.valueOf(jogadorAtual));
    }

    private boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botoes[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void reiniciarJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
            }
        }
        jogadorAtual = 'X';
    }
    //simples vizualizacao de vitorias
    private void atualizarLabelVitorias() {
        labelVitorias.setText("X: " + vitoriasX + "  O: " + vitoriasO);
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}