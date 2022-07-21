/**
* Class: CIS 2371 Introduction to Java
* Quarter: Fall 2012
* Instructor: 
* Description: Unit 07 lab
* Due: 11/18/2012
* @author Clifton Davis
* @version 1.0
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
*
*/


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Unit07LabPart1 extends JFrame {
  public Unit07LabPart1() {
   
    JPanel p1 = new JPanel(new GridLayout(1, 3, 5, 5));
    JButton jbtButton1 = new JButton("Button 1");
    JButton jbtButton2 = new JButton("Button 2");
    JButton jbtButton3 = new JButton("Button 3");
    
    p1.add(jbtButton1);
    p1.add(jbtButton2);
    p1.add(jbtButton3);
    p1.setBorder(new TitledBorder("Panel 1"));

    
    Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    Border lineBorder = new LineBorder(Color.BLACK, 2);

    
    JPanel p2 = new JPanel(new GridLayout(1, 3, 5, 5));
    JButton jbtButton4 = new JButton("Button 4");
    JButton jbtButton5 = new JButton("Button 5");
    JButton jbtButton6 = new JButton("Button 6");
    
    p2.add(jbtButton4);
    p2.add(jbtButton5);
    p2.add(jbtButton6);
    p2.setBorder(new TitledBorder("Panel 2"));

    
    setLayout(new GridLayout(2, 1, 5, 5));
    add(p1);
    add(p2);
  }

  public static void main(String[] args) {
   
    JFrame frame = new Unit07LabPart1();
    frame.setTitle("Unit07LabPart1");
    frame.setSize(300, 150);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
