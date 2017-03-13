// http://www.codejava.net/java-se/swing/jbutton-basic-tutorial-and-examples

// create frame and add button
import javax.swing.JFrame; 
import javax.swing.JButton;

// used for images
import javax.swing.ImageIcon;

// borderlayout, doesn't work
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

// listener for an event
import java.awt.event.ActionListener;	
import java.awt.event.ActionEvent;

// popup panel for buttonCustom click
import javax.swing.JOptionPane;

public class JButtonImageExample 
{
	// variables
	
	// constructor
	JButtonImageExample()
    {  
        // JFrame, top level container
        JFrame frame=new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // always add this
        
        // set up for image
        String imagePathX = "X.png";
        String imagePathO = "O.png";
        ImageIcon imageX = new ImageIcon(getClass().getResource(imagePathX));
                          
        // Creating Button          
        JButton button = new JButton("Click Me..");
        JButton buttonImage = new JButton(imageX);
        JButton buttonImageMsg = new JButton("Start", new ImageIcon(getClass().getResource(imagePathO)));
        JButton buttonCustom = new JButton("Edit");
        
        // format buttons
        button.setBounds(20,20,90,50);  
        buttonImage.setBounds(20,100,90,50);
        buttonImageMsg.setBounds(150,20,90,50);
        buttonCustom.setBounds(150,100,90,50);
        
        // customizing buttonCustom
        buttonCustom.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        buttonCustom.setBackground(Color.YELLOW);
        buttonCustom.setForeground(Color.BLUE);
        
        // adding event listener for JButton=button
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent evt) 
            {
                // do everything here...
            	System.out.println("button was clicked");
            }
        });	// end of listener method
        
        // adding event listener for JButton=buttonImage X-Image
        buttonImage.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent evt) 
            {
            	// delegate to event handler method
                buttonActionPerformed(evt);
            }

			private void buttonActionPerformed(ActionEvent evt) 
			{
				// Auto-generated method stub
				System.out.println("Private = buttonActionPerformed method clicked \"X-image\"");
			}
        });
        
        // adding event listener for JButton=buttonImage O-Image
        buttonImageMsg.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent evt) 
            {
            	// delegate to event handler method
                buttonActionPerformed(evt);
            }

			private void buttonActionPerformed(ActionEvent evt) 
			{
				// Auto-generated method stub
				System.out.println("Private = buttonActionPerformed method clicked \"O-image\"");
			}
        });
        
     // adding a popup event listener for JButton=buttonCustom
        buttonCustom.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent evt) 
            {
            	// delegate to event handler method
                buttonActionPerformed(evt);
            }

			private void buttonActionPerformed(ActionEvent evt) 
			{
				// Auto-generated method stub
				JOptionPane.showMessageDialog(null, "CustomButtonClicked", "CustomPopUp", 
						JOptionPane.INFORMATION_MESSAGE);
			}
        });
        
             
        //Adding button onto the frame
        frame.add(button); 
        frame.add(buttonImage);
        frame.add(buttonImageMsg, BorderLayout.WEST);
        frame.add(buttonCustom);
                  
        // Setting Frame size. This is the window size
        frame.setSize(300,200);  
        frame.setLayout(null);  
        frame.setVisible(true);  
                  
   
     }
	
              
	 public static void main(String[] args) 
	 {  
	        new JButtonImageExample();  
	 }  
}