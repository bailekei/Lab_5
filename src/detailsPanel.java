//javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class detailsPanel extends JPanel implements ActionListener {
    JLabel jlbguesses = new JLabel("Number of Guesses ");
    JTextField jtfGuesses = new JTextField(12);


    //ButtonGroup group = new ButtonGroup();

    JButton jbtSubmit = new JButton("Sumbit");


    public detailsPanel() {

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPanel.setBackground(Color.WHITE);
        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // JPanel p1 = new JPanel();
        JPanel p1 = new JPanel(new GridLayout(3, 1, 2, 2));
        p1.setBackground(Color.WHITE);
        p1.setBorder(new TitledBorder("Guessing Game"));
        // p1.add(jlbFirstName);
        // p1.add(jtfFirstName);
        JPanel pGuesses = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        pGuesses.setBackground(Color.WHITE);
        pGuesses.add(jlbguesses);
        pGuesses.add(jtfGuesses);

        mainPanel.add(p1);
        p1.add(pGuesses);


        jbtSubmit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String message = "";

        JOptionPane.showMessageDialog(null, message);
    }
}
