/**
 * Based on package: youtube.swingtutorial.TicTacToe.java
 * This aims to become my first puzzle game
 */
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

// action events
import java.awt.event.ActionListener;	
import java.awt.event.ActionEvent;


public class JPanelTest extends JFrame implements ActionListener
{
	// variables
	byte value = 0;
	/*
	 * 0:inactive
	 * 1:test
	 * 2:list
	 */
	
	
	public static void main(String[] args)
	{
		new JPanelTest();
		
	}
	
	
	// constructor
	public JPanelTest()
	{
		
		// set up a constructor for a JFrame
		super("JPanelTestJFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// must have to close window
		setSize(400,300);
        setResizable(false);
        setLocationRelativeTo(null);	// place location into center of the screen
        
        this.GridLayoutTest();

		setVisible(true);		// always the last option
		
	}
	

	
	
	public void GridLayoutTest()
	{
		// create a panel object
 		JPanel mainPanel = new JPanel(new GridLayout(2,2));

 		// create buttons
 		JButton button1 = new JButton();
 		button1.setFont(new Font("Courier", Font.BOLD, 22));
 		button1.setBackground(Color.BLUE);
 		button1.setForeground(Color.WHITE);
 		button1.setText("button 1");
 		
 		JButton button2 = new JButton();
 		button2.setFont(new Font("Courier", Font.BOLD, 22));
 		button2.setBackground(Color.RED);
 		button2.setForeground(Color.WHITE);
 		button2.setText("button 2");
 		
 		JButton button3 = new JButton();
 		button3.setFont(new Font("Courier", Font.BOLD, 22));
 		button3.setBackground(Color.GREEN);
 		button3.setForeground(Color.WHITE);
 		button3.setText("button 3");
 		
 		JButton button4 = new JButton();
 		button4.setFont(new Font("Courier", Font.BOLD, 22));
 		button4.setBackground(Color.MAGENTA);
 		button4.setForeground(Color.WHITE);
 		button4.setText("button 4");
 		
 		// add buttons to panel
 		mainPanel.add(button1);
 		mainPanel.add(button2);
 		mainPanel.add(button3);
 		mainPanel.add(button4);
 		
     	add(mainPanel);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// object to decide where the event came from
		Object src = e.getSource();
		
		/*
		//test
		if (src.equals(test))
		{
			process = 1;
			int num = Integer.parseInt(input.getText());
			// ensure that primes object has a long enough range
			if (primes.getLength() < num)
			{
				primes = new Primes(num, primes);
			}
			// finds prime from object
			if (primes.test(num))
			{
				print(num + " is prime");
				primesFound.setText("1");
			}
			else
			{
				print(num + " is not prime");
				primesFound.setText("0");
			}
			printEnd();
			process = 0;
		}
		
		//list
		if (src.equals(list))
		{
			switch(process)
			{
			case 0:
				process = 2;
				stop = false;
				Thread th = new Thread(new List(this));
				th.start();
				list.setText("Stop");
				break;
			case 2:
				stop = true;
				break;
			
			}

		}
		
		// clear
		if (src.equals(clear))
		{
			primes_list.setText("");
		}
		*/
	}
	
	
	// probably never used
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

}