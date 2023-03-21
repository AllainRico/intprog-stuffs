//Practice rani siya

import javax.swing.*;
import java.awt.*;
class gui{
    public static void main(String args[]){
    JFrame frame = new JFrame("Chat Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
       JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel setA = new JLabel("Enter Values of set A");
        JTextField a = new JTextField(10);
        JLabel setB = new JLabel("Enter Values of set B");
        JTextField b = new JTextField(10); // accepts upto 10 characters
        JButton inter = new JButton("Intersection");
        JButton union = new JButton("Union");
        JButton difference = new JButton("Difference");
        JButton isSubset = new JButton("isSubset");
        JButton cardinality = new JButton("cardinality");
        JButton exit = new JButton("exit");
        panel.setLayout(new GridLayout(5, 2));
        panel.add(setA); // Components Added using Flow Layout
        panel.add(a);
        panel.add(setB);
        panel.add(b);
        panel.add(inter);
        panel.add(union);
        panel.add(difference);
        panel.add(isSubset);
        panel.add(cardinality);
        panel.add(exit);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}