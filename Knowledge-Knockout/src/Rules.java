import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    JComboBox<String> topicComboBox; // Dropdown for topic selection
    JTextField numberOfQuestionsField;

    Rules() {
        // Set a solid background color (#e5d4ef)
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(0xE5D4EF)); // Background color
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);
        setContentPane(panel);

        // Heading
        JLabel heading = new JLabel("Knowledge Knockout Quiz");
        heading.setBounds(30, 10, 700, 70);
        heading.setFont(new Font("Serif", Font.BOLD, 36));
        heading.setForeground(new Color(0x433878)); // #433878 heading color
        heading.setHorizontalAlignment(JLabel.CENTER);
        add(heading);

        // Rules Section
        JLabel rules = new JLabel();
        rules.setBounds(50, 80, 700, 160);
        rules.setFont(new Font("SansSerif", Font.PLAIN, 18));
        rules.setText(
                "<html>" +
                        "<b>Rules:</b>" + "<br>" +
                        "1. You can't give any wrong answer." + "<br>" +
                        "2. You'll get 15 seconds for each question." + "<br>" +
                        "3. A mix of easy and difficult questions will be asked." + "<br>" +
                        "4. Your score will be displayed at the end of the quiz." + "<br>" +
                        "</html>"
        );
        rules.setHorizontalAlignment(JLabel.CENTER);
        rules.setForeground(new Color(0x474F7A)); // #E4B1F0 rules text color
        add(rules);

        // Topic Selection Label
        JLabel enterTopic = new JLabel("Select Topic:");
        enterTopic.setBounds(80, 250, 250, 30);
        enterTopic.setFont(new Font("SansSerif", Font.PLAIN, 22));
        enterTopic.setForeground(new Color(0x81689D)); // #C68FE6 select topic label color
        add(enterTopic);

        // Dropdown for Topics
        String[] topics = {"AOOP", "DSA", "FDS", "OS"};
        topicComboBox = new JComboBox<>(topics);
        topicComboBox.setBounds(380, 250, 200, 35);
        topicComboBox.setFont(new Font("SansSerif", Font.PLAIN, 18));
        topicComboBox.setBackground(new Color(251, 251, 225, 255)); // Light Gray background for dropdown
        topicComboBox.setForeground(Color.BLACK);
        add(topicComboBox);

        // Number of Questions Label
        JLabel enterNumberOfQuestions = new JLabel("Number of Questions:");
        enterNumberOfQuestions.setBounds(80, 300, 300, 30);
        enterNumberOfQuestions.setFont(new Font("SansSerif", Font.PLAIN, 22));
        enterNumberOfQuestions.setForeground(new Color(0x81689D)); // #C68FE6 for number of questions
        add(enterNumberOfQuestions);

        // Number of Questions Input
        numberOfQuestionsField = new JTextField();
        numberOfQuestionsField.setBounds(380, 300, 200, 35);
        numberOfQuestionsField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        numberOfQuestionsField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(0, 91, 65), 2), // Deep Navy
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        add(numberOfQuestionsField);

        // Start Button with Elegant Color Scheme
        start = new JButton("Start Quiz");
        start.setBounds(300, 380, 150, 45);
        styleButton(start, new Color(78, 98, 126), new Color(255, 248, 220)); // Midnight Blue with Ivory Text
        start.addActionListener(this);

        // Back Button with Rich Color Scheme
        back = new JButton("Back");
        back.setBounds(470, 380, 150, 45);
        styleButton(back, new Color(78, 98, 126), new Color(3, 4, 5)); // Emerald Green with Ivory Text
        back.addActionListener(this);

        add(start);
        add(back);

        setSize(750, 600);
        setLocation(360, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Styling for Buttons with Hover Effect and Elegant Colors
    private void styleButton(JButton button, Color bgColor, Color fgColor) {
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createLineBorder(bgColor, 2));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(12, 9, 9)); // Royal Gold hover
                button.setForeground(new Color(255, 255, 255)); // Midnight Blue text
            }

            public void mouseExited(MouseEvent evt) {
                button.setBackground(bgColor);
                button.setForeground(fgColor);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            String chosenTopic = (String) topicComboBox.getSelectedItem();
            String numQuestionsText = numberOfQuestionsField.getText();

            try {
                int numberOfQuestions = Integer.parseInt(numQuestionsText);

                if (numberOfQuestions <= 0) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid number of questions (greater than 0).", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    setVisible(false);
                    new Quiz(chosenTopic, numberOfQuestions); // Pass topic and number of questions to Quiz
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules();
    }
}
