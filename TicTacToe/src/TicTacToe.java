
public class TicTacToe {

	public static void main(String[] args) {
		
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
				               {'-', '+', '-', '+', '-'},
				               {' ', '|', ' ', '|', ' '},
				               {'-', '+', '-', '+', '-'},
				               {' ', '|', ' ', '|', ' '}};
		PrintBoardGame(gameBoard);
			}
 public static void PrintBoardGame(char[] [] gameBoard) {
	 for(char[] row : gameBoard){
		//for(char c : row) {
			System.out.println(row);
			//} 
		System.out.println();

		}

	 
 }
}

