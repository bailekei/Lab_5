import javax.swing.*;
import java.util.Random;

/***********************************************************************************************************************
 * CIS 162 Project 2
 * Setting up the game board
 *
 * @author Keilani Bailey and Emma Owen
 * @consulted Tim Nguyen
 **********************************************************************************************************************/

public class GuessTheNumber {

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
    }
}