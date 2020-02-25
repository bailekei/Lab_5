import javax.swing.*;

public class GuessGameGUI {
    public static void main(String arg[]){

        JFrame gui = new JFrame("Guessing Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GuessGamePanel panel = new GuessGamePanel();
        gui.getContentPane().add(panel);

        gui.setSize(400,600);
        gui.pack();
        gui.setVisible(true);
    }
}
