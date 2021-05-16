package Introducton;

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
				Utils.simulation();
				
			} else if (choice == 2) {
				Utils.exit();
				
			}
		} while (choice != 2);
		
		scan.close();
	}

}
