/**
* Class: CIS 2371 Introduction to Java
* Quarter: Fall 2012
* Instructor: 
* Description: Unit 08 lab
* Due: 12/03/2012
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
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Exercise17_1 extends JFrame {

public static void main(String[] args) {
    Exercise17_1 frame = new Exercise17_1();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise17_1");
    frame.setSize(500, 200);
    frame.setVisible(true);
  }

  public Exercise17_1() extends MessagePanel {
  
  public JRadioButton jrbRed, jrbYellow, jrbWhite, jrbGreen, jrbGray;
    
    JPanel p1 = new JPanel(new GridLayout(1, 5, 5, 5));
    jpRadioButtons.add(jrbRed = new JRadioButton("Red"));
    jpRadioButtons.add(jrbYellow = new JRadioButton("Yellow"));
    jpRadioButtons.add(jrbWhite = new JRadioButton("White"));
	jpRadioButtons.add(jrbGray = new JRadioButton("Gray"));
	jpRadioButtons.add(jrbGreen = new JRadioButton("Green"));
    add(jpRadioButtons, BorderLayout.CENTER);
	
	 
    p1.jpRadioButtons.add(jrbRed);
    p1.jpRadioButtons.add(jrbYellow);
    p1.jpRadioButtons.add(jrbWhite);
	p1.jpRadioButtons.add(jrbGray);
	p1.jpRadioButtons.add(jrbGreen);
	
	 jrbRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.red);
      }
    });
    jrbYellow.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.Yellow);
      }
    });
    jrbWhite.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.White);
      }
    });
	jrbGray.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.Gray);
      }
    });
    jrbGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.setForeground(Color.Green);
      }
    });
    
   
    p1.setBorder(new TitledBorder("Select Message Panel Background"));

    
    Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
    Border lineBorder = new LineBorder(Color.BLACK, 2);

    
    JPanel p2 = new JPanel(new GridLayout(2, 0, 5, 5));
    // Create a panel for displaying message
  public MessagePanel messagePanel
    = new MessagePanel("Welcome to Java");

  // Declare two buttons to move the message left and right
  public JButton jbtLeft = new JButton("<=");
  public JButton jbtRight = new JButton("=>");
    
    public ButtonDemo(){
    // Set the background color of messagePanel
    messagePanel.setBackground(Color.white);

    // Create Panel jpButtons to hold two Buttons "<=" and "right =>"
    JPanel jpButtons = new JPanel();
    jpButtons.setLayout(new FlowLayout());
    p2.jpButtons.add(jbtLeft);
    p2.jpButtons.add(jbtRight);

    // Set keyboard mnemonics
    jbtLeft.setMnemonic('L');
    jbtRight.setMnemonic('R');
	
	 setLayout(new BorderLayout());
    p2.add(messagePanel, BorderLayout.CENTER);
    p2.add(jpButtons, BorderLayout.SOUTH);

    // Register listeners with the buttons
    jbtLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    jbtRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });

    
    setLayout(new GridLayout(2, 1, 5, 5));
    add(p1);
    add(p2);
	}
	
	} 
}