import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("TIC TAC TOE");
		System.out.println("--------------------------------");
		//Input Details of player 1
		System.out.print("Player 1 name: ");
		String name = scanner.next();
		System.out.print("Player 1, X or O: ");
		
		//To input a character
		char option = scanner.next().charAt(0);

		Person player1 = new Person(name, option);
		
		//Input details of player 2
		System.out.println("--------------------------------");
		System.out.print("Player 2 name: ");
		name = scanner.next();

		if(option == 'X') {
			option = 'O';
		} else {
			option = 'X';
		}
		
		Person player2 = new Person(name, option);
		
		player1.printData();
		player2.printData();
		System.out.println("--------------------------------");
		
		Grid grid = new Grid();
		grid.printGrid();
		System.out.println("--------------------------------");
		boolean result;
		int counter = 1;
		
		while(true) {
			System.out.print(player1.name + ", " + player1.option + " at position: ");
			result = grid.input(player1.option, scanner.nextInt());
			if(result == true) {
				grid.printGrid();
				System.out.print(player1.name + " wins!");
				break;
			} else {
				grid.printGrid();
				if(counter == 9) {
					System.out.print("\n Match Drawn");
					break;
				} else {
					System.out.print(player2.name + ", " + player2.option + " at position: ");
					result = grid.input(player2.option, scanner.nextInt());
					if(result == true) {
						grid.printGrid();
						System.out.print(player2.name + " wins!");
						break;
					} else {
						grid.printGrid();
					}
				}
			}
			counter += 2;
		}
		
	}
	
}
