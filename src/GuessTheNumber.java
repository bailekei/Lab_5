import javax.swing.*;
import java.util.Random;

/***********************************************************************************************************************
 * CIS 163 - Lab 5 Exceptions
 * Selects a random number to be guessed
 *
 * @author Keilani Bailey & Emma Owen
 **********************************************************************************************************************/

public class GuessTheNumber extends JFrame{

    public int random;


    public int attempts;
    private String title;

    public GuessTheNumber(){
        attempts = 0;
        Random rand = new Random();
        random = rand.nextInt(100) +1;
    }
    public int checkGuess(int guess) {

        MyCustomException tj = new MyCustomException();


        try {

                if (guess > random) {
                    throw new MyCustomTooHighException(guess);
                } else if (guess < random) {
                    throw new MyCustomTooLowException(guess);
                }

            } catch (MyCustomTooHighException e) {
                attempts++;
                JOptionPane.showMessageDialog(null, "The value is smaller", "Alert", JOptionPane.ERROR_MESSAGE);

            } catch (MyCustomTooLowException e) {
                attempts++;
                JOptionPane.showMessageDialog(null, "The value is bigger", "Alert", JOptionPane.ERROR_MESSAGE);

            } finally {


                if(guess == random)
                {
                    JOptionPane.showMessageDialog(null, "You Won!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                else if(attempts ==10){
                    JOptionPane.showMessageDialog(null, "The Number was " + random +"\nGame Over!", "Winner", JOptionPane.ERROR_MESSAGE);
                }
                return 10-attempts;
            }
  }

}