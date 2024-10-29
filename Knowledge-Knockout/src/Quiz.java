import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList; // Import ArrayList specifically
import java.util.List; // Import List from java.util
import java.util.Random;

public class Quiz extends JFrame implements ActionListener {
    JLabel questionNo, question, currentScore, timerLabel;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup optionGroup;
    JButton next, submit;

    public static int timer = 15; // Timer for each question
    public static boolean answered = false;
    public static int score = 0;
    public static int currentQuestionIndex = 0;

    Questions questionsSet;
    String[][] questions;
    String[][] answers;
    String[][] userAnswer = new String[100][1];
    List<Integer> selectedQuestions; // Use java.util.List to avoid ambiguity
    int totalQuestions;
    Timer timerObject; // Timer object

    Quiz(String topic, int numberOfQuestions) {
        // Set a gradient background
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(175, 230, 173), 0, getHeight(), Color.WHITE);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setLayout(null);
        setContentPane(panel);

        QuestionsFactory questionsFactory = new QuestionsFactory();
        questionsSet = questionsFactory.getQuestions(topic);
        questions = questionsSet.getQuestions();
        answers = questionsSet.getAnswers();

        // Set the number of questions based on user input
        totalQuestions = Math.min(numberOfQuestions, questions.length);

        selectedQuestions = new ArrayList<>();
        Random random = new Random();

        // Generate unique random question indices
        while (selectedQuestions.size() < totalQuestions) {
            int randomIndex = random.nextInt(questions.length);
            if (!selectedQuestions.contains(randomIndex)) {
                selectedQuestions.add(randomIndex);
            }
        }

        questionNo = new JLabel();
        questionNo.setBounds(20, 20, 50, 30);
        questionNo.setFont(new Font("Arial", Font.BOLD, 24));
        add(questionNo);

        question = new JLabel();
        question.setBounds(60, 20, 1100, 30);
        question.setFont(new Font("Arial", Font.PLAIN, 24));
        add(question);

        currentScore = new JLabel();
        currentScore.setBounds(360, 480, 900, 30);
        currentScore.setFont(new Font("Arial", Font.PLAIN, 24));
        add(currentScore);

        timerLabel = new JLabel("Time Left: " + timer);
        timerLabel.setBounds(1000, 20, 200, 30);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timerLabel);

        option1 = new JRadioButton();
        option1.setBounds(60, 70, 700, 30);
        option1.setBackground(new Color(255, 255, 215));
        option1.setFont(new Font("Arial", Font.PLAIN, 20));
        add(option1);

        option2 = new JRadioButton();
        option2.setBounds(60, 110, 700, 30);
        option2.setBackground(new Color(255, 255, 215));
        option2.setFont(new Font("Arial", Font.PLAIN, 20));
        add(option2);

        option3 = new JRadioButton();
        option3.setBounds(60, 150, 700, 30);
        option3.setBackground(new Color(255, 255, 215));
        option3.setFont(new Font("Arial", Font.PLAIN, 20));
        add(option3);

        option4 = new JRadioButton();
        option4.setBounds(60, 190, 700, 30);
        option4.setBackground(new Color(255, 255, 215));
        option4.setFont(new Font("Arial", Font.PLAIN, 20));
        add(option4);

        optionGroup = new ButtonGroup();
        optionGroup.add(option1);
        optionGroup.add(option2);
        optionGroup.add(option3);
        optionGroup.add(option4);

        next = new JButton("Next");
        next.setBounds(760, 480, 120, 40);
        next.setFont(new Font("Arial", Font.BOLD, 20));
        next.setBackground(new Color(127, 0, 147));
        next.setForeground(Color.WHITE);
        next.setFocusPainted(false);
        next.setBorderPainted(false);
        next.setOpaque(true);
        next.addActionListener(this);
        add(next);

        score = 0;
        currentQuestionIndex = 0;

        start(selectedQuestions.get(currentQuestionIndex));

        setSize(1220, 680);
        setLocation(160, 60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            answered = true;
            if (optionGroup.getSelection() == null) {
                userAnswer[selectedQuestions.get(currentQuestionIndex)][0] = "";
            } else {
                userAnswer[selectedQuestions.get(currentQuestionIndex)][0] = optionGroup.getSelection().getActionCommand();
            }

            // Update score based on the answer
            if (userAnswer[selectedQuestions.get(currentQuestionIndex)][0].equals(answers[selectedQuestions.get(currentQuestionIndex)][0])) {
                score++;
            }

            currentQuestionIndex++;

            if (currentQuestionIndex < totalQuestions) {
                start(selectedQuestions.get(currentQuestionIndex));
            } else {
                // Calculate unanswered and wrong questions
                int unanswered = totalQuestions - currentQuestionIndex; // Calculate unanswered questions
                int wrong = totalQuestions - score - unanswered; // Calculate wrong answers

                // Transition to the Score screen with all results
                setVisible(false);
                new Score(score, totalQuestions, unanswered, wrong); // Pass all results
            }
        }
    }

    public void start(int questionIndex) {
        questionNo.setText("" + (currentQuestionIndex + 1) + ". ");
        question.setText(questions[questionIndex][0]);

        option1.setText(questions[questionIndex][1]);
        option1.setActionCommand(questions[questionIndex][1]);

        option2.setText(questions[questionIndex][2]);
        option2.setActionCommand(questions[questionIndex][2]);

        option3.setText(questions[questionIndex][3]);
        option3.setActionCommand(questions[questionIndex][3]);

        option4.setText(questions[questionIndex][4]);
        option4.setActionCommand(questions[questionIndex][4]);

        optionGroup.clearSelection();
        currentScore.setText("Score: " + score);

        // Reset the timer for the next question
        resetTimer();
    }

    // Method to reset and start the timer
    private void resetTimer() {
        timer = 15; // Reset timer to 15 seconds
        timerLabel.setText("Time Left: " + timer);
        answered = false; // Reset answered state

        // Stop any existing timer if it is running
        if (timerObject != null && timerObject.isRunning()) {
            timerObject.stop();
        }

        // Create a new timer
        timerObject = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer > 0) {
                    timer--;
                    timerLabel.setText("Time Left: " + timer);
                } else {
                    timerObject.stop();
                    JOptionPane.showMessageDialog(null, "Time's up! Moving to the next question.");
                    next.doClick(); // Automatically click next button when time is up
                }
            }
        });
        timerObject.start(); // Start the timer
    }

    public static void main(String[] args) {
        int numberOfQuestions = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of questions: "));
        new Quiz("AOOP", numberOfQuestions);
    }
}
