// http://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
// https://docs.oracle.com/javase/8/docs/api/java/awt/BorderLayout.html
// http://www.java2s.com/Tutorial/Java/0240__Swing/Catalog0240__Swing.htm

// frame and panel
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;


import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

// layout
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;

public class JPanelTest extends JFrame
{
	public static void main(String[] args)
	{
		new JPanelTest();
		
		/*
		// create frame container
		JFrame mainFrame = new JFrame("Name this frame");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack(); 			// resizes the window to accommodate the components within
		mainFrame.setSize(400,300);
        mainFrame.setResizable(false);
		
		// create a panel object
		JPanel mainPanel = new JPanel(new GridLayout(2,2));
		Container contents = mainFrame.getContentPane();
		
		// create buttons
		JButton button1 = new JButton();
		button1.setFont(new Font("Courier", Font.BOLD, 22));
		button1.setForeground(Color.BLUE);
		button1.setText("button 1");
		
		JButton button2 = new JButton();
		button2.setFont(new Font("Courier", Font.BOLD, 22));
		button2.setForeground(Color.RED);
		button2.setText("button 2");
		
		JButton button3 = new JButton();
		button3.setFont(new Font("Courier", Font.BOLD, 22));
		button3.setForeground(Color.GREEN);
		button3.setText("button 3");
		
		JButton button4 = new JButton();
		button4.setFont(new Font("Courier", Font.BOLD, 22));
		button4.setForeground(Color.MAGENTA);
		button4.setText("button 4");
		
		// add buttons to panel
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		mainPanel.add(button4);
		
		
		
		
		// last item in program
	    mainFrame.add(mainPanel);
	    mainFrame.setVisible(true);
	    */
	}
	
	
	// constructor
	public JPanelTest()
	{
		
		// set up a constructor for a JFrame
		super("JPanelTestJFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// must have to close window
		setSize(400,300);
        setResizable(false);
 
        this.GridLayoutTest();
        this.ContainerLayoutTest();
        
 
     	
		setVisible(true);		// always the last option
		
	}
	
	public void ContainerLayoutTest()
	{
		// create a panel object
 		JPanel mainPanel = new JPanel(new GridLayout(2,2));
 		
// 		http://www.toves.org/books/java/ch24-swing/
// 		implement the container layout
// 		Container contents = mainPanel.getContentPane();

 		// create buttons
 		JButton button1 = new JButton();
 		button1.setFont(new Font("Courier", Font.BOLD, 22));
 		button1.setForeground(Color.BLUE);
 		button1.setText("button 1");
 		
 		JButton button2 = new JButton();
 		button2.setFont(new Font("Courier", Font.BOLD, 22));
 		button2.setForeground(Color.RED);
 		button2.setText("button 2");
 		
 		JButton button3 = new JButton();
 		button3.setFont(new Font("Courier", Font.BOLD, 22));
 		button3.setForeground(Color.GREEN);
 		button3.setText("button 3");
 		
 		JButton button4 = new JButton();
 		button4.setFont(new Font("Courier", Font.BOLD, 22));
 		button4.setForeground(Color.MAGENTA);
 		button4.setText("button 4");
 		
 		// add buttons to panel
 		mainPanel.add(button1);
 		mainPanel.add(button2);
 		mainPanel.add(button3);
 		mainPanel.add(button4);
 		
     	add(mainPanel);
		
	}
	
	
	public void GridLayoutTest()
	{
		// create a panel object
 		JPanel mainPanel = new JPanel(new GridLayout(2,2));

 		// create buttons
 		JButton button1 = new JButton();
 		button1.setFont(new Font("Courier", Font.BOLD, 22));
 		button1.setForeground(Color.BLUE);
 		button1.setText("button 1");
 		
 		JButton button2 = new JButton();
 		button2.setFont(new Font("Courier", Font.BOLD, 22));
 		button2.setForeground(Color.RED);
 		button2.setText("button 2");
 		
 		JButton button3 = new JButton();
 		button3.setFont(new Font("Courier", Font.BOLD, 22));
 		button3.setForeground(Color.GREEN);
 		button3.setText("button 3");
 		
 		JButton button4 = new JButton();
 		button4.setFont(new Font("Courier", Font.BOLD, 22));
 		button4.setForeground(Color.MAGENTA);
 		button4.setText("button 4");
 		
 		// add buttons to panel
 		mainPanel.add(button1);
 		mainPanel.add(button2);
 		mainPanel.add(button3);
 		mainPanel.add(button4);
 		
     	add(mainPanel);
		
	}

}