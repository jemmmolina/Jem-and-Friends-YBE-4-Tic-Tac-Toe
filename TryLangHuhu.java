public class TryLangHuhu {

	public static final int ROWS = 3;
	public static final int COLS = 3;

	private char[][] board;
	private char mark;

	public TryLangHuhu() {
		board = new char[ROWS][COLS];
		initBoard();
	}

	public void initBoard() {
		for (int row=0; row<ROWS; row++) {
			for (int col=0; col<COLS; col++) {
				board[row][col] = ' ';
			}
		}
	}

	public void showBoard() {
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

   	public boolean isDraw() {

   		for (int row=0; row<ROWS; row++) {
			for (int col=0; col<COLS; col++) {
				if(board[row][col] == ' ') return false;
			}
		}
		return true;
   	}
 

   	public boolean hasWinner() {

   		for (int i=0; i<3; i++) {
   			if ((hasThree(board[i][0], board[i][1], board[i][2]))
   				|| (hasThree(board[0][i], board[1][i], board[2][i]))
   				|| (hasThree(board[0][0], board[1][1], board[2][2])))
   					return true;
   		}
   		return false;
   	}

   private boolean hasThree(char c1, char c2, char c3) {
        if ((c1 != ' ') && (c1 == c2) && (c2 == c3))
			return true;
		else return false;
    }

   	public boolean hasPutMark(int row, int col) {

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


}