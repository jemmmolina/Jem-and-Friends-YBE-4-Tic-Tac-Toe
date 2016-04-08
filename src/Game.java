import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Game extends JPanel{
	private	int turnNumber = 0;
	private int winner = 0;
	private String p1Name;
	private String p2Name;
	private int rounds;
	private int currentRound;	
	private String prevPlayer;
	private String prevPlayerSymbol = "X";
	private String p1Symbol = "X";
	private String p2Symbol = "O";
	private int p1GamesWon = 0;
	private int p2GamesWon = 0;
	
	
	private JLabel turnNumberText;
	private JLabel turnPlayerText;
	private JLabel player1Name;
	private JLabel player2Name;
	private JLabel gameNumber; 
	private final JButton[][] buttons;

	JPanel ticTacToe = new JPanel(new GridLayout(3,3));
	JPanel header = new JPanel(new GridLayout(1,2));
	JPanel footer = new JPanel(new GridLayout(1,3));	
	public Game(){
		super(new BorderLayout());
		buttons = new JButton[3][3];		
		for(int i=0;i<3;i++){
			for(int j=0; j<3; j++){
				buttons[i][j] = new JButton("");
				final int x = i;
				final int y = j;
				buttons[i][j].addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						repaint();
						buttons[x][y].setText(prevPlayerSymbol);
						buttons[x][y].setEnabled(false);
						checkWinner(buttons, prevPlayer);		
						setTurnNumber();
					}
				});
				ticTacToe.add(buttons[i][j]);		
			}
		}	

		turnNumberText = new JLabel("Turn Number: 1");	
		turnPlayerText = new JLabel(" ");
		header.add(turnNumberText);
		header.add(turnPlayerText);	
		


		player1Name = new JLabel("PLAYER 1");
		player2Name = new JLabel("PLAYER 2");	
		gameNumber = new JLabel("Game n out of N");
		footer.add(player1Name);
		footer.add(gameNumber);
		footer.add(player2Name);	
		

		this.add(header,BorderLayout.PAGE_START);
		this.add(ticTacToe,BorderLayout.CENTER);
		this.add(footer,BorderLayout.PAGE_END);
	}

	public int getTurnNumber(){
		return this.turnNumber;
	}
	public void setTurnNumber(){
		this.turnNumber += 1;
		turnNumberText.setText("Turn Number: " + String.valueOf(this.turnNumber +1));
		if(prevPlayer == p1Name){
			turnPlayerText.setText(p2Name);
			prevPlayer = p2Name;
			prevPlayerSymbol = p2Symbol;
		}else{
			turnPlayerText.setText(p1Name);
			prevPlayer = p1Name;
			prevPlayerSymbol = p1Symbol;
		}
	}
	public boolean checkWinner(JButton[][] buttons, String player){
   		for (int row=0; row<3; row++) {
   			if (hasThree(buttons[row][0].getText(), buttons[row][1].getText(), buttons[row][2].getText())){ 				
				//call reset here  
				resetGame(player); 				
				return true;
			}
   		}

   		for (int col=0; col<3; col++) {
   			if (hasThree(buttons[0][col].getText(), buttons[1][col].getText(), buttons[2][col].getText())){
   				//call reset
				resetGame(player); 	
				return true;
			}
   		}

   		if (hasThree(buttons[0][0].getText(), buttons[1][1].getText(), buttons[2][2].getText())){
			//call reset  
			resetGame(player); 	 			
			return true;
		}

   		return false;
	}
	private boolean hasThree(String s1, String s2, String s3) {
		System.out.print(s1);
		System.out.print(s2);
		System.out.println(s3);
        if ((s1 != "") && (s1 == s2) && (s2 == s3))
			return true;
		else return false;
    }

	public void setWinner(int x){
		this.winner = x;
	}
	
	public void setState(String p1Name, String p2Name, String rounds){
		this.p1Name = p1Name;
		this.prevPlayer = p1Name;
		turnPlayerText.setText(prevPlayer);
		player1Name.setText(this.p1Name + ": " + Integer.toString(p1GamesWon));
		this.p2Name = p2Name;
		player2Name.setText(this.p2Name + ": " + Integer.toString(p2GamesWon));
		this.rounds = Integer.parseInt(rounds);
		this.currentRound = 1;
		gameNumber.setText("Game " + Integer.toString(this.currentRound) + " out of " + Integer.toString(this.rounds)); 
	}

	public void resetGame(String winner){
		declareWinner(winner);
		if(p1GamesWon < rounds/2 + 1 && p2GamesWon < rounds/2 + 1){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					this.buttons[i][j].setText("");
					this.buttons[i][j].setEnabled(true);
				}
			}
			turnNumber = -1;
			currentRound += 1;
			gameNumber.setText("Game " + Integer.toString(this.currentRound) + " out of " + Integer.toString(this.rounds));
			turnNumberText.setText("Turn Number: 1");
			
		}else{
			System.exit(1);
		}
	}
	
	public void declareWinner(String player){
		if(player == p1Name){
			p1GamesWon +=1;
			player1Name.setText(this.p1Name + ": " + Integer.toString(p1GamesWon));
		}else{
			p2GamesWon +=1;
			player2Name.setText(this.p2Name + ": " + Integer.toString(p2GamesWon));
		}
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setVisible(false);
		JOptionPane.showMessageDialog( frame , player + " has won!");
	}
}