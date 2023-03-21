import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetFrame extends JFrame implements ActionListener{



 JPanel north, center;
 JButton btnSetA, btnSetB, btnShow;
 JLabel lblSetA, lblSetB, lblUnion, lblIntersection,lblAB,lblBA,lblSubset;
 MySet setA = new MySet();
 MySet setB = new MySet();
 
 public SetFrame(){
  super("Set");
  
  setSize(500,500);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  north = new JPanel();
  north.setBackground(Color.BLACK);
  center = new JPanel();
  center.setBackground(Color.LIGHT_GRAY);
  north.setLayout(new FlowLayout());
  center.setLayout(new GridLayout(8,2));
  
  btnSetA = new JButton("setA");
  btnSetB = new JButton("setB"); 
  btnShow = new JButton("Show Results");
  
  lblSetA = new JLabel();
  lblSetB = new JLabel();
  lblUnion = new JLabel();
  lblIntersection = new JLabel();
  lblAB = new JLabel();
  lblBA = new JLabel();
  lblSubset = new JLabel();
  add(north,BorderLayout.NORTH);
  add(center);
  
  JLabel label = new JLabel("Enter elements for");
  label.setForeground(Color.white);
  north.add(label);
  north.add(btnSetA);
  north.add(btnSetB);
 center.add(btnShow);
 center.add(new JLabel());
 center.add(new JLabel("setA contains:"));
 center.add(lblSetA);
 center.add(new JLabel("setB contains:"));
 center.add(lblSetB);
 center.add(new JLabel("union:"));
 center.add(lblUnion);
 center.add(new JLabel("intersection:"));
 center.add(lblIntersection);
 center.add(new JLabel("A-B:"));
 center.add(lblAB);
 center.add(new JLabel("B-A:"));
 center.add(lblBA);
 center.add(new JLabel("Other Remarks:"));
 center.add(lblSubset);

  
 pack();
 btnSetA.addActionListener(this);
 btnSetB.addActionListener(this);
 btnShow.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e){
 if(e.getSource() == btnSetA){
  String input = JOptionPane.showInputDialog("Enter elements for setA[separate by space]");
  String [] strData = input.split(" ");
  for(int i = 0; i < strData.length; i++){
   setA.add(Integer.parseInt(strData[i]));
  }
 }
 if(e.getSource() == btnSetB){
 String input = JOptionPane.showInputDialog("Enter elements for setA[separate by space]");
  String [] strData = input.split(" ");
  for(int i = 0; i < strData.length; i++){
   setB.add(Integer.parseInt(strData[i]));
  }
 }
 if(e.getSource() == btnShow){
   lblSetA.setText(setA.toString());
   lblSetB.setText(setB.toString());
   lblUnion.setText(setA.union(setB).toString());
   lblIntersection.setText(setA.intersection(setB).toString());
   lblAB.setText(setA.differenceA(setB).toString());
   lblBA.setText(setA.differenceB(setB).toString());
   lblSubset.setText(isasub());
  }
 }
 
 public String isasub(){
   if(setB.isSubset(setA) == true){
      return "B is a subset to A";
   }
   else return "B is not a subset to A";
 }
 

 public static void main(String [] args){
  new SetFrame();
 }
}