

// frame and panel
import javax.swing.JFrame;
import javax.swing.JPanel;

// layout
import java.awt.BorderLayout;

public class JPanelExamples extends JFrame
{
	// ---variables----
	

	
	// ---objects----
	JPanel mainPanel = new JPanel();
	

	
	// 2. create the panel objects

	
	// 3. add panel objects to main panel
	

	
//	mainPanel.add(south, BorderLayout.SOUTH);
	
	

	// ---constructor----
	public JPanelExamples()
	{
		// 1. set up a constructor for a JFrame
		super("JFrame-Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// must have to close window
		setSize(400, 600);
		setResizable(false);
		
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
		setVisible(true);		// always the last option
	}
	
	
	public static void main(String[] args)
	{
		new JPanelExamples();
		
	}
}