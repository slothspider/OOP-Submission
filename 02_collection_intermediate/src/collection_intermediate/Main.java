package collection_intermediate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer choice;
		do {
			Utils.printMenu();
			choice = 0;
			choice = scan.nextInt();
			if (choice == 1) {
				ViewShoes.view();
				
			} else if (choice == 2) {
				AddShoes.add();
				
			} else if (choice == 3) {
				DeleteShoes.delete();
				
			} else if (choice == 4) {
				Exit.exit();
				
			}
		} while (choice != 4);
		
		scan.close();
	}

}
