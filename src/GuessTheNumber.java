import javax.swing.*;
import java.awt.*;
import java.util.Random;

/***********************************************************************************************************************
 * CIS 162 Project 2
 * Setting up the game board
 *
 * @author Keilani Bailey and Emma Owen
 * @consulted Tim Nguyen
 **********************************************************************************************************************/

public class GuessTheNumber extends JFrame{

    int x;
    public static void main(String args[]){

        Random rand = new Random();
        MyCustomException tj = new MyCustomException();

    try{


    }catch (MyCustomTooHighException e){
        JOptionPane.showMessageDialog(null, "The value is smaller", "Alert", JOptionPane.ERROR_MESSAGE);

    } catch (MyCustomTooLowException e){
        JOptionPane.showMessageDialog(null, "The value is bigger", "Alert", JOptionPane.ERROR_MESSAGE);

    }finally {

    }
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new GuessTheNumber("Guessing Game");
            //JFrame frame = new TestListener();
            frame.setTitle("Game Survey");
            frame.setSize(700, 700);
            frame.setLocationRelativeTo(null);//centers the frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    private detailsPanel detailsPanel;
    public GuessTheNumber (String title){
        super(title);

        //set layout manager
        setLayout(new BorderLayout());
        //Create Swing Component
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Okay");

        detailsPanel = new detailsPanel();

        //Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(detailsPanel, BorderLayout.WEST);

        //add behavior
    }
}