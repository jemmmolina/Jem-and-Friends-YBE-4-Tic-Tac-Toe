import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JFrame{
	//private final String NAME = "TIC TAC TOE"; 
	JButton[] buttons = new JButton[9];
		
	public Board(){
		super("Tic-Tac-Toe");
		this.setPreferredSize(new Dimension(500, 300));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container =  getContentPane();
		container.setLayout(new BorderLayout());

		JPanel menu = new JPanel(new GridLayout(2,1));
		JPanel game = new JPanel(new GridLayout(3,3));

		JButton newGameButton = new JButton("NEW GAME");
		JButton exitGameButton = new JButton("EXIT");
		


		for(int i=0;i<9;i++){
			buttons[i] = new JButton(Integer.toString(i));
				
			buttons[i].addMouseListener(new MouseListener(){   
  				public void mouseClicked(MouseEvent e){
  				}
  				public void mouseEntered(MouseEvent e){
    				//this.setForeground(Color.CYAN);
					System.out.println("LOL");  				
				}
  				public void mouseExited(MouseEvent e){
    				//this.setForeground(Color.RED);
					System.out.println("LOL");  
  				}
  				public void mousePressed(MouseEvent e){
   					//this.setForeground(Color.BLUE);
					System.out.println("LOL");    				
				}
  				public void mouseReleased(MouseEvent e){
  				}
			});
			game.add(buttons[i]);
		}
		
		menu.add(newGameButton);
		menu.add(exitGameButton);

		//container.add(menu, BorderLayout.PAGE_START);
		container.add(game);
		this.pack();
	}

	//public set
		
}
