import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel{
	//JButton[] buttons = new JButton[9];
	JPanel ticTacToe = new JPanel(new GridLayout(3,3));
	JPanel header = new JPanel(new GridLayout(1,2));
	JPanel footer = new JPanel(new GridLayout(1,3));	
	public Game(){
		super(new BorderLayout());
		//ticTacToe.setPreferredSize(new Dimension(300,300));
		JButton[] buttons = new JButton[9];
		for(int i=0;i<9;i++){
			buttons[i] = new JButton(Integer.toString(i));				
			buttons[i].addMouseListener(new MouseListener(){   
  				public void mouseClicked(MouseEvent e){
  				}
  				public void mouseEntered(MouseEvent e){
    				//this.setForeground(Color.CYAN);
					//System.out.println("LOL");  				
				}
  				public void mouseExited(MouseEvent e){
    				//this.setForeground(Color.RED);
					//System.out.println("LOL");  
  				}
  				public void mousePressed(MouseEvent e){
   					//this.setForeground(Color.BLUE);
					//System.out.println("LOL");    				
				}
  				public void mouseReleased(MouseEvent e){
  				}
			});
			ticTacToe.add(buttons[i]);
		}

		JLabel turnNumber = new JLabel("TURN NUMBER");	
		JLabel turnPlayer = new JLabel("PLAYER HERE");
		header.add(turnNumber);
		header.add(turnPlayer);	
		


		JLabel playerName1 = new JLabel("PLAYER 1",2);
		JLabel playerName2 = new JLabel("PLAYER 2");	
		JLabel gameNumber = new JLabel("Game n out of N");
		footer.add(playerName1);
		footer.add(gameNumber);
		footer.add(playerName2);	
		

		this.add(header,BorderLayout.PAGE_START);
		this.add(ticTacToe,BorderLayout.CENTER);
		this.add(footer,BorderLayout.PAGE_END);
	}
}
