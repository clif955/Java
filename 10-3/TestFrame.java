//GUIs
import javax.swing.JFrame;
import javax.swing.*;

public class TestFrame{
	public static void main (String[] args)
	{
		//create button with text "OK"
		JButton jbtOK = new JButton("OK");
		
		//create button with text cancel
		JButton jbtCan = new JButton("Cancel");
		
		JLabel jlblName = new JLabel("Enter your name:");
		
		JTextField jtfName = new JTextField("Type your name here");
		
		JCheckBox jchkBold = new JCheckBox("Bold");
		
		JCheckBox jchkItalic = new JCheckBox("Italic");
		
		JRadioButton jrbRed = new JRadioButton("red");
		
		JRadioButton jrbBlue = new JRadioButton("blue");
		
		JComboBox jcboYear = new JComboBox(new String[] {"2012","2013","2014","2000"});
		
		//create a panel to group components
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCan);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbBlue);
		panel.add(jcboYear);
		
		
		
		JFrame frame1 = new JFrame();
		frame1.add(panel);
		frame1.setTitle("Window 1");
		frame1.setSize(450,150);
		frame1.setLocation(200,100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	
		JFrame frame2 = new JFrame();
		frame2.setTitle("Window 2");
		frame2.setSize(200,150);
		frame2.setLocation(410,100);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}
	
}