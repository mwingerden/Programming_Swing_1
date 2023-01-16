import javax.swing.*;
import java.awt.*;

public class Lab01 extends JFrame{

    public JMenuBar createMenuBar() {
        //Create and Add MenuBar
        JMenuBar jMenuBar = new JMenuBar();

        //Create Menu
        JMenu file = new JMenu("File");
        JMenu about = new JMenu("About");

        //Create and Add Items to Appropriate Menus
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        file.add(open);
        file.add(save);
        file.add(quit);

        //Add Menus to MenuBar
        jMenuBar.add(file);
        jMenuBar.add(about);

        //Return MenuBar
        return jMenuBar;
    }

    public JPanel createColoredBoxes() {
        //Create JPanel to Hold Colors
        JPanel boxes = new JPanel(new GridLayout(2, 2));

        //instantiate
        JPanel cyan = new JPanel(new GridLayout(1, 1));
        JPanel pink = new JPanel(new GridLayout(1, 1));
        JPanel yellow = new JPanel(new GridLayout(1, 1));
        JPanel orange = new JPanel(new GridLayout(1, 1));

        //Cyan
        cyan.add(new JLabel("Hola"));
        cyan.setBackground(Color.CYAN);
        //Pink
        pink.add(new JLabel("World!"));
        pink.setBackground(Color.PINK);
        //Yellow
        yellow.add(new JLabel("Hello"));
        yellow.setBackground(Color.YELLOW);
        //Orange
        orange.add(new JLabel("Mundo!"));
        orange.setBackground(Color.ORANGE);

        //Add to Boxes
        boxes.add(yellow);
        boxes.add(pink);
        boxes.add(cyan);
        boxes.add(orange);

        //Return Colored Boxes
        return boxes;
    }

    public void createAndShowGUI() {
        //Create and set up window.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content.
        setJMenuBar(createMenuBar());
        add(createColoredBoxes());

        //Establish misc.
        setTitle("Lab 01");
        setSize(450, 350);
        setVisible(true);
    }


    public static void main(String [] args) {
        Lab01 lab01 = new Lab01();
        lab01.createAndShowGUI();
    }
}
