package Collection_Easy;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Utils.title();
		
		Integer choice;
		do {
			Utils.printMenu();
			choice = 0;
			choice = scan.nextInt();
			
			if (choice == 1) {
				StartSharing.startSharing();
				
			} else if (choice == 2) {
				Update.update();
				
			} else if (choice == 3) {
				Delete.delete();
				
			} else if (choice == 4) {
				Exit.exit();
				
			}
		} while (choice != 4);
		
		scan.close();
	}

}
