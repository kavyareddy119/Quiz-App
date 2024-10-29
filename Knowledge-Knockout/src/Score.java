import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(int score, int totalQuestions, int unanswered, int wrong) {
        // Set the size and location of the window
        setBounds(400, 150, 750, 550);

        // Set a gradient background
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(223, 192, 255), 0, getHeight(), Color.WHITE);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);
        setContentPane(panel);

        // Heading
        JLabel heading = new JLabel("Thank you for playing Knowledge Knockout");
        heading.setBounds(80, 30, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
        heading.setForeground(new Color(14, 41, 69));
        add(heading);

        // Score Display
        JLabel lblscore = new JLabel("Your score is " + score + " out of " + totalQuestions);
        lblscore.setBounds(250, 100, 400, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(new Color(8, 24, 39));
        add(lblscore);

        // Summary of Results
        JLabel summary = new JLabel("<html>Summary:<br>Correct Answers: " + score +
                "<br>Wrong Answers: " + wrong +
                "<br>Unanswered: " + unanswered + "</html>");
        summary.setBounds(250, 160, 400, 100);
        summary.setFont(new Font("Arial", Font.PLAIN, 20));
        summary.setForeground(new Color(8, 24, 39));
        add(summary);

        // Play Again Button
        JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(300, 280, 140, 40);
        playAgain.setBackground(new Color(36, 7, 43, 255));
        playAgain.setForeground(Color.WHITE);
        playAgain.setFont(new Font("Arial", Font.BOLD, 20));
        playAgain.setFocusPainted(false);
        playAgain.setBorderPainted(false);
        playAgain.setOpaque(true);
        playAgain.addActionListener(this);
        add(playAgain);

        // Set the default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); // Navigate back to the login screen or main menu
    }

    public static void main(String[] args) {
        // Example usage
        int totalQuestions = 10;
        int score = 6; // Replace with actual score
        int unanswered = 2; // Example unanswered questions
        int wrong = totalQuestions - score - unanswered; // Calculate wrong answers
        new Score(score, totalQuestions, unanswered, wrong);
    }
}
