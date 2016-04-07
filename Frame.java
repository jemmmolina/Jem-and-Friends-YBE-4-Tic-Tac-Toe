import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
	MainMenu mainMenu = new MainMenu();	
	Game game = new Game();
	final Container container;	

	public Frame(){
		super("Tic-Tac-Toe");
		this.setPreferredSize(new Dimension(500, 300));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		container =  getContentPane();
		container.setLayout(new CardLayout());

		mainMenu.getOKButton().addActionListener(new ActionListener(){   
			public void actionPerformed(ActionEvent e){
				CardLayout card = (CardLayout) container.getLayout();
				card.show(container, "Game");
			}
		});
		container.add(mainMenu, "Menu");
		container.add(game, "Game");
		this.pack();
	}
		
}
