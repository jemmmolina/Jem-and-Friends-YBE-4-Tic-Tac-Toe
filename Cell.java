/* Models for each cell in game */
 
public class Cell {  // save as Cell.java
   Seed content; // content of this cell of type Seed.
   int row, col;
 
   public Cell(int row, int col) {
      this.row = row;
      this.col = col;
      clear();  // clear content
   }
 
   /* Clear the cell content to EMPTY */
   public void clear() {
      content = Seed.EMPTY;
   }
   
	public void paint() {
		switch (content) {
			case NONE: System.out.print(" O "); break;
			case CROSS:  System.out.print(" X "); break;
			case EMPTY:  System.out.print("   "); break;
		}
	}
}