import javax.swing.*;
import java.awt.*;

public class Board extends JFrame{
	//private final String NAME = "TIC TAC TOE"; 
	JButton[] buttons = new JButton[9];

	public Board(){
		super("TIC TAC TOE");
		this.setPreferredSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container =  getContentPane();
		container.setLayout(new BorderLayout());

		JPanel menu = new JPanel(new GridLayout(2,1));
		JPanel game = new JPanel(new GridLayout(3,3));

		JButton newGameButton = new JButton("NEW GAME");
		JButton exitGameButton = new JButton("EXIT");
		
		for(int i=0;i<8;i++){
			buttons[i] = new JButton();
			game.add(buttons[i]);		
		}
		
		menu.add(newGameButton);
		menu.add(exitGameButton);

		container.add(menu, BorderLayout.PAGE_START);
		container.add(game, BorderLayout.PAGE_END);
		this.pack();
	}	
}
