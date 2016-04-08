import java.util.Scanner;

public class TryLangHuhu {

	public static final int ROWS = 3;
	public static final int COLS = 3;

	private static char[][] board;
	private static char mark;

	public TryLangHuhu() {
		board = new char[ROWS][COLS];
		initBoard();
		showBoard();
	}

	public static void initBoard() {
		for (int row=0; row<ROWS; row++) {
			for (int col=0; col<COLS; col++) {
				board[row][col] = ' ';
			}
		}
	}

	public static void showBoard() {
		System.out.println("-------------");
		
        for (int row=0; row<ROWS; row++) {
        	System.out.print("| ");
            for (int col=0; col<COLS; col++) {
				System.out.print(board[row][col] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}	
	}

   	public static boolean isDraw() {

   		for (int row=0; row<ROWS; row++) {
			for (int col=0; col<COLS; col++) {
				if(board[row][col] == ' ') return false;
			}
		}
		return true;
   	}
 

   	public static boolean hasWinner() {

   		for (int i=0; i<3; i++) {
   			if ((hasThree(board[i][0], board[i][1], board[i][2]))
   				|| (hasThree(board[0][i], board[1][i], board[2][i]))
   				|| (hasThree(board[0][0], board[1][1], board[2][2])))
   					return true;
   		}
   		return false;
   	}

   private static boolean hasThree(char c1, char c2, char c3) {
        if ((c1 != ' ') && (c1 == c2) && (c2 == c3))
			return true;
		else return false;
    }

   	public static boolean hasPutMark(int row, int col) {

   		if((row >= 0) && (row < ROWS)) {
   			if((col >= 0) && (col < COLS)) {
   				if(board[row][col] == ' ') {
   					board[row][col] = mark;
   					return true;
   				}
   			}
   		}
   		return false;
   	}

	public static void printBoard() {
		for (int row=0; row<ROWS; row++) {
			for (int col=0; col<COLS; col++) {
				System.out.println(board[row][col]);
				if (col != COLS -1) {
					System.out.print("|"); 
				}		
			}
			System.out.println(); 
			if (row != ROWS - 1) {
				System.out.println("-----------");
			}
		}
		System.out.println();
	}   	

   	public static void main(String[] args) {
   		
   		Scanner sc = new Scanner(System.in);
   		TryLangHuhu t = new TryLangHuhu();
   		//initBoard();

   		//do {
   			



   		//} while (!(hasWinner()) || !(isDraw()));



   	}

}