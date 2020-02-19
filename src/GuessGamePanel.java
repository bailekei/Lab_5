import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGamePanel extends JPanel {

    private GuessTheNumber guess;
    JButton submitButton;
    JTextField gField;
    public GuessGamePanel(){

        gField = new JTextField("0");
        add(gField);
        add(new JLabel("Guess:"));
        //guess = GuessTheNumber(0);
        submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int check = Integer.parseInt(String.valueOf(gField));

            if(submitButton ==e.getSource()){
                guess.checkGuess(check);
            }

        }

    }

}
