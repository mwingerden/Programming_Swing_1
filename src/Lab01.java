import javax.swing.*;
import java.awt.*;

public class Lab01 extends JFrame{
    private JFrame window;
    private JPanel cyan;
    private JPanel pink;
    private JPanel yellow;
    private JPanel orange;

    public static void main(String [] args) {
        Lab01 lab01 = new Lab01();
        lab01.window = new JFrame();
        lab01.setLayout(new GridLayout(2, 2));

        //instantiate
        lab01.cyan = new JPanel();
        lab01.pink = new JPanel();
        lab01.yellow = new JPanel();
        lab01.orange = new JPanel();

        //Cyan
        JLabel hello = new JLabel("Hola");
        lab01.cyan.add(hello);
        lab01.cyan.setBackground(Color.CYAN);
        //Pink
        lab01.pink.add(new JLabel("World!", SwingConstants.LEFT));
        lab01.pink.setBackground(Color.PINK);
        //Yellow
        lab01.yellow.add(new JLabel("Hello", SwingConstants.CENTER));
        lab01.yellow.setBackground(Color.YELLOW);
        //Orange
        lab01.orange.add(new JLabel("Mundo!", SwingConstants.CENTER));
        lab01.orange.setBackground(Color.ORANGE);

        //Add
        lab01.add(lab01.yellow);
        lab01.add(lab01.pink);
        lab01.add(lab01.cyan);
        lab01.add(lab01.orange);

        lab01.setTitle("Lab 01");
        lab01.setSize(400, 400);
        lab01.setLocationRelativeTo(null);
        lab01.setVisible(true);
        lab01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
