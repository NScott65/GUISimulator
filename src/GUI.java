import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    //class attributes
    private static JLabel label1;

    //Constructor
    public GUI(){
        //Create Frame
        JFrame frame = new JFrame("Test GUI");
        //set the size
        frame.setSize(300, 500);
        //Makes program exit when we close the GUI window
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create Panel & set defaults
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(4,1,10,10));
        //add panel to frame
        frame.add(panel);

        //Create Buttons
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");

        //Add buttons to the Panel
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        //Adding actions to Buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b1Press();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b2Press();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b3Press();
            }
        });


        //Create label and add to panel
        label1 = new JLabel("This is a Label.");
        label1.setHorizontalAlignment(JLabel.CENTER);
        //add label
        panel.add(label1);


        //Makes frame appear
        //Has to be the last thing in the constructor
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();


    }

    //Methods that are called when buttons are clicked
    public void b1Press(){
        label1.setText("You clicked B1.");
    }

    public void b2Press(){
        label1.setText("You clicked B2.");
    }

    public void b3Press(){
        label1.setText("You clicked B3.");
    }
}
