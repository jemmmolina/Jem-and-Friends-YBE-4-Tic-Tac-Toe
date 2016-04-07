import java.util.Scanner;

public class Main {
   private Board board;
   private GameState currentState;
   private Seed currentPlayer;
 
   private static Scanner in = new Scanner(System.in);

   public GameMain() {
      board = new Board();
 
      initGame();

      do {
         playerMove(currentPlayer);
         board.paint();             // ask the board to paint itself
         updateGame(currentPlayer);

         if (currentState == GameState.CROSS_WON) {
            System.out.println("'X' won! Game over!");
         } else if (currentState == GameState.NONE_WON) {
            System.out.println("'O' won! Game over!");
         } else if (currentState == GameState.DRAW) {
            System.out.println("It's a draw! Game over!");
         }
		 
         currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
      } while (currentState == GameState.PLAYING);
   }

   public void initGame() {
      board.init();
      currentPlayer = Seed.NONE;       // None plays first
      currentState = GameState.PLAYING;
   }

   public void playerMove(Seed theSeed) {
      boolean validInput = false;
      do {
         if (theSeed == Seed.NONE) {
            System.out.print("Player 'O', enter your move (Row[1-3] and Column[1-3]): ");
         } else {
            System.out.print("Player 'X', enter your move (Row[1-3] and Column[1-3]): ");
         }
         int row = in.nextInt() - 1;
         int col = in.nextInt() - 1;
         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
               && board.cells[row][col].content == Seed.EMPTY) {
            board.cells[row][col].content = theSeed;
            board.currentRow = row;
            board.currentCol = col;
            validInput = true;
         } else {
            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                  + ") is not valid. Try again.");
         }
      } while (!validInput);
   }

   public void updateGame(Seed theSeed) {
      if (board.hasWon(theSeed)) {
         currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
      } else if (board.isDraw()) {
         currentState = GameState.DRAW;
      }
   }

   public static void main(String[] args) {
      new GameMain();  // Bahala na constructor gumawa dito
   }
}