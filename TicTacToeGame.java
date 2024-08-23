import java.util.Scanner;

public class TicTacToeGame {
		    public static void main(String[] args) {
		        char[][] table = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
		        Scanner scanner = new Scanner(System.in);
		        int Player = 1;

		        for (int i = 0; i < 9; i++) {
		            int row = -1, column = -1;
		            
		            do {
		                System.out.println("\nPlayer " + Player + " TURN!!!"); 
		            
		                do {
		                    System.out.println("Enter a Row position you want to place your move : ");
		                    while (!scanner.hasNextInt()) {
		                        System.out.println("Please press the Position(number between 0 and 2) on the rows where you'd wish to place your move!");
		                        scanner.next();
		                    }
		                    row = scanner.nextInt();
		                    if (row < 0 || row > 2) {
		                        System.out.println("Please press the Position on the rows(number between 0 and 2) where you'd wish to place your move!");
		                    }
		                } while (row < 0 || row > 2);

		                do {
		                    System.out.println("Enter a Column position you want to place your move : ");
		                    while (!scanner.hasNextInt()) {
		                        
		                        System.out.println("Please press the Position(number between 0 and 2) in the columns where you'd wish to place your move!");
		                        scanner.next();
		                    }
		                    column = scanner.nextInt();
		                    if (column < 0 || column > 2) {
		                        System.out.println("Please press the Position(number between 0 and 2) in the columns where you'd wish to place your move!");
		                    }
		                } while (column < 0 || column > 2);
		                
		            } while (table[row][column] != '-');

		            table[row][column] = Player == 1 ? 'X' : 'O';
		            printTable(table);
		            
		            System.out.println("PERFECT! Player " + Player + " has made their move"); 

		            Player = Player == 1 ? 2 : 1;
		        }
		    }

		    public static void printTable(char[][] board) {
		        for (int i = 0; i < board.length; i++) {
		            for (int j = 0; j < board[i].length; j++) {
		                System.out.print(board[i][j] + " ");
		            }
		            System.out.println();
		   }

	}

}
