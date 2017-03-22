/**
 * adding actions to button pushed to change color
 */


import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;  

// actions
import java.awt.event.ActionListener;	// listener
import java.awt.Color;
import java.awt.event.ActionEvent;

public class JButtonExample extends JFrame implements ActionListener
{
	// variables
	JPanel panel = new JPanel();		//  create a JPanel
	JButton button = new JButton("click me");	
	JButton button1 = new JButton("click me");	
	

	byte value = 0;
	/*
	 0:nothing
	 1:pressOne	--> Red
	 2:pressTwo --> Blue
	 */
	
	// constructor
    JButtonExample()
    {      	
        
    	super("Button Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // always do this
        setSize(300,200);  
        setResizable(false);
        setLocationRelativeTo(null);	// place location into center of the screen
        
        
        this.CreateButton();
        
        setVisible(true);  
        

    }  
    public void CreateButton()
    {

        
		// Creating Button          
		

    	
    	button.setBounds(20,20,90,50);  
		button.addActionListener(this);
		
		button1.setBounds(100,20,90,50);  
		button1.addActionListener(this);

		// define layout
		panel.setLayout(null);
		
		// add buttons to panel
		panel.add(button); 
		panel.add(button1); 

		
		// add panel to JFrame
		add(panel);
		
		
       
    }
    
    public void ChangeButtonColor()
    {
//		X = new ImageIcon(this.getClass().getResource("/X.png"));
//		O = new ImageIcon(this.getClass().getResource("/O.png"));
		//this.addActionListener(this);
    	
    	
    }
    
	public void actionPerformed(ActionEvent e)
	{
		
		value++;
		value %= 3;	// divides LH operand by RH operand; puts remainder in LH operand
		switch(value)
		{
		case 0:
			// added to solve the MAC problem of background color
			button.setOpaque(true);
			button1.setOpaque(true);
			
			button.setBackground(null);
			button.setForeground(null);
			button1.setBackground(null);
			button1.setForeground(null);
			break;
		case 1:
			button.setBackground(Color.RED);
			button.setForeground(Color.BLUE);
			button1.setBackground(Color.RED);
			button1.setForeground(Color.BLUE);
			break;
		case 2:
			button.setBackground(Color.BLUE);
			button.setForeground(Color.RED);
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.RED);
			break;
		
		}
		
		/*
		// object to decide where the event came from
		Object src = e.getSource();
		if (src.equals(button))
		{
			button.setBackground(Color.RED);
		}
		*/
	}

              
	 public static void main(String[] args) 
	 {  
	        new JButtonExample();  
	 }  
}