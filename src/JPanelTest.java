// http://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
// https://docs.oracle.com/javase/8/docs/api/java/awt/BorderLayout.html

// frame and panel
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


// layout
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;

public class JPanelTest extends JFrame
{
	public static void main(String[] args)
	{
		//new JPanelTest();
		

		//super("Prime Number Generation");
		JFrame mainFrame = new JFrame("MainMethodJFrame");
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setSize(400,600);
		mainFrame.setResizable(false);
		
		// main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		//mainPanel.add(new JButton("Okay"), BorderLayout.NORTH);
		mainPanel.add(new JButton("North"), BorderLayout.NORTH);
		mainPanel.add(new JButton("South"), BorderLayout.SOUTH);
		mainPanel.add(new JButton("East"), BorderLayout.EAST);
		mainPanel.add(new JButton("West"), BorderLayout.WEST);
		mainPanel.add(new JButton("Center"), BorderLayout.CENTER);
		
		/*
		// create buttons
		JButton button = new JButton("Button1 (Page_Start)");
		mainPanel.add(button, BorderLayout.PAGE_START);
		
		button = new JButton("Button2 (CENTER)");
		mainPanel.add(button, BorderLayout.CENTER);
		

		button = new JButton("Button 3 (LINE_START)");
		mainPanel.add(button, BorderLayout.LINE_START);
		
		button = new JButton("Long-Named Button 4 (PAGE_END)");
		mainPanel.add(button, BorderLayout.PAGE_END);
		
		button = new JButton("5 (LINE_END)");
		mainPanel.add(button, BorderLayout.LINE_END);
		*/
		
		
		
		
		
		
		
		// display all panel components
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);

		
		
		
		
		/*
		// 1. JFrame
				// west panel
		JPanel west = new JPanel();
		JButton test = new JButton("Test");
		JButton list = new JButton("List");
		JButton clear = new JButton("Clear");
		JButton reset = new JButton("Reset");
		west.add(test);
		west.add(list);
		west.add(clear);
		west.add(reset);
		
		// north panel
		JPanel north =  new JPanel();
		
		
		// center
		JTextArea primes_list = new JTextArea();
		primes_list.setEditable(false);
		primes_list.setLineWrap(true);
		primes_list.setWrapStyleWord(true);

		
		// south panel
		JPanel south = new JPanel(); 
		JLabel inputLabel = new JLabel("Input");
		JTextField input = new JTextField(10);
		JProgressBar progress = new JProgressBar();
		JLabel primesFoundLabel = new JLabel("Primes Found");
		JTextField primesFound = new JTextField(10);
		south.add(inputLabel);
		south.add(input);
		south.add(progress);
		south.add(primesFoundLabel);
		south.add(primesFound);
		mainPanel.add(south, BorderLayout.SOUTH);
		
		// define layout
		mainPanel.setLayout(new BorderLayout());
		
		// Prime number output (center)
//		primes_list.setEditable(false);
//		primes_list.setLineWrap(true);
//		primes_list.setWrapStyleWord(true);
//		mainPanel.add(primes_scroll,BorderLayout.CENTER);
		
		// Buttons (west)
		west.setLayout(new GridLayout(10,1));
		
		// add listeners
//		test.addActionListener(this);
//		list.addActionListener(this);
//		clear.addActionListener(this);
		
		// add buttons to west panel
//		west.add(test);
//		west.add(list);
//		west.add(clear);
		mainPanel.add(west, BorderLayout.WEST);
		
		// Variable/progress (south)
//		progress.setString("Waiting");
//		progress.setStringPainted(true);
//		primesFound.setEditable(false);
//		south.add(inputLabel);
//		south.add(input);
//		south.add(progress);
//		south.add(primesFoundLabel);
//		south.add(primesFound);
		mainPanel.add(south, BorderLayout.SOUTH);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);




		*/
		
		
		
	}
	
	
	// constructor
	public JPanelTest()
	{
		
		// 1. set up a constructor for a JFrame
		super("JPanelTestJFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// must have to close window
		setSize(400, 600);
		setResizable(false);
		
		/*
		// define layout
		mainPanel.setLayout(new BorderLayout());
		
		
		// define panels objects
		JPanel north = new JPanel();
		JPanel south = new JPanel();
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		JPanel center = new JPanel();
		
		// add panels to main panel
		mainPanel.add(north, BorderLayout.NORTH);
		
		
		
		
		
		
		add(mainPanel);
		*/
		
		setVisible(true);		// always the last option
		
	}
	
	

}