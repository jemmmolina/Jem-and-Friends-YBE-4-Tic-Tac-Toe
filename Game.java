import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JPanel{
	JButton[] buttons = new JButton[9];

	
	public Game(){
		super(new GridLayout(3,3));
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
			this.add(buttons[i]);
		}
	}
}
