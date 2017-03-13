//nothing yet


import javax.swing.JFrame; 
import javax.swing.JButton;  

public class JButtonPopupExample 
{
	JButtonPopupExample()
    {  
        // JFrame, top level container
        JFrame frame=new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                          
        // Creating Button          
        JButton button = new JButton("Click Me..");
        JButton button1 = new JButton("Button1:Click Me..");
 
        button.setBounds(20,20,90,50);  
        button1.setBounds(100,100,200,20);
             
        //Adding button onto the frame
        frame.add(button); 
        frame.add(button1);
                  
        // Setting Frame size. This is the window size
        frame.setSize(300,200);  
        
        frame.setLayout(null);  
        frame.setVisible(true);  
                  
         
                  
    }  
              
	 public static void main(String[] args) 
	 {  
	        new JButtonPopupExample();  
	 }  
}