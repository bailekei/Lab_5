import javax.swing.*;

public class GuessGameGUI {
    public static void main(String arg[]){

        JMenu fileMenu;
        JMenuItem quitItem;
        JCheckBoxMenuItem suspendItem;
        JCheckBoxMenuItem saveItem;
        JCheckBoxMenuItem loadItem;
        JMenuBar menus;

        fileMenu = new JMenu("File");
        quitItem = new JMenuItem("Quit");
        suspendItem = new JCheckBoxMenuItem ("Suspend");
        saveItem = new JCheckBoxMenuItem ("Save");
        loadItem = new JCheckBoxMenuItem ("Load");
        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(suspendItem);
        fileMenu.add(quitItem);
        menus = new JMenuBar();

        menus.add(fileMenu);

        JFrame gui = new JFrame("Guessing Game");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GuessGamePanel panel = new GuessGamePanel();
        gui.getContentPane().add(panel);

        gui.setSize(400,600);
        gui.setJMenuBar(menus);
        gui.pack();
        gui.setVisible(true);
    }
}
