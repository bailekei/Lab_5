import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGamePanel extends JPanel {

    private GuessTheNumber guess;
    JButton submitButton;
    JTextField gField;
    JLabel aField;
    public GuessGamePanel(){

        setLayout(new GridLayout(5,2));
        setBackground(Color.lightGray);

        guess = new GuessTheNumber();
        add(new JLabel("Pick a number between 1 -100."));
        add(new JLabel("Guess:"));
        gField = new JTextField("0");
        add(gField);
        submitButton = new JButton("Submit");
        add(submitButton);
        submitButton.addActionListener(new ButtonListener());
        aField = new JLabel("10");
        add(new JLabel("Attempts Left:"));
        add(aField);
    }

    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int playsguess;
            if(submitButton ==e.getSource()){
                playsguess=Integer.parseInt(gField.getText());

                aField.setText(String.valueOf(guess.checkGuess(playsguess)));
            }


        }

    }

}
