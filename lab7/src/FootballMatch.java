import javax.swing.*; // для создания графического интерфейса
import java.awt.*; // для работы с графикой и компоновки элементов
import java.awt.event.*; // для работы с событиями

public class FootballMatch extends JFrame implements ActionListener {
    private JButton milanButton, madridButton;
    private JLabel resultLabel, lastScorerLabel, winnerLabel;
    private int milanScore = 0, madridScore = 0;

    public FootballMatch() {
        setTitle("Football Match: Milan vs Madrid");
        setSize(1000, 600);
        setLayout(new GridLayout(4, 2));

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);


        milanButton.setBackground(Color.RED);
        milanButton.setForeground(Color.LIGHT_GRAY);

        madridButton.setBackground(Color.BLUE);
        madridButton.setForeground(Color.LIGHT_GRAY);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}