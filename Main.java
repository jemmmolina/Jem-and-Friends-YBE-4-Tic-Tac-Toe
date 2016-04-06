import java.util.Scanner;

public class Main {
/**
	public class TTTConsole {				//for console run
	   public static final int EMPTY = 0;
	   public static final int CROSS = 1;
	   public static final int NONE = 2;
	   
	   public static final int PLAYING = 0;
	   public static final int DRAW = 1;
	   public static final int CROSS_WON = 2;
	   public static final int NONE_WON = 3;
	 
	   public static final int ROWS = 3, COLS = 3;
	   public static int[][] board = new int[ROWS][COLS];
	   public static int currentState;

	   public static int currentPlayer;
	   public static int currntRow, currentCol;
	 
	   public static Scanner in = new Scanner(System.in); // the input Scanner
	}
**/	
	public static void main(String[] args) {
		Board b = new Board();
		
		initGame();
		
		do {
			playerMove(currentPlayer);
			updateGame(currentPlayer, currentRow, currentCol);
			printBoard();
		}
		
		public static void printBoard() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				printCell(board[row][col]); // print each of the cells
					if (col != COLS - 1) {
						System.out.print("|");   // print vertical partition
					}
			}
			System.out.println();
			if (row != ROWS - 1) {
				System.out.println("-----------"); // print horizontal partition
			}
		}
		System.out.println();
		}
		
		public static void printCell(int content) {
			switch (content) {
				case NONE: System.out.print(" O "); break;
				case CROSS:  System.out.print(" X "); break;
				case EMPTY:  System.out.print("   "); break;		
			}
		}
	}
}