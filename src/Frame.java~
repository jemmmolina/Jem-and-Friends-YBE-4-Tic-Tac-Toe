import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{			//executes JFrame class
	MainMenu mainMenu = new MainMenu();	
	Game game = new Game();
	final Container container;				//sets container for tic tac toe main file

	public Frame(){							//Frame
		super("Tic-Tac-Toe");								//calls tic tac toe for super
		this.setPreferredSize(new Dimension(500, 300));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		container =  getContentPane();
		container.setLayout(new CardLayout());

		mainMenu.getOKButton().addActionListener(new ActionListener(){  
			@Override 						//overrides action performance for action events
			public void actionPerformed(ActionEvent e){
				CardLayout card = (CardLayout) container.getLayout();
				card.show(container, "Game");
				game.setState(mainMenu.getPlayer1Name(), mainMenu.getPlayer2Name(), mainMenu.getRounds());
				
			}
		});
		container.add(mainMenu, "Menu");	//calls menu for container
		container.add(game, "Game");		//calls game for container
		this.pack();
	}
	public void checkHorizontal(){
		game.checkHorizontal();
	}
	public void checkVertical(){
		game.checkVertical();
	}
	public void checkDiagonal(){
		game.checkDiagonal();
	}
}
