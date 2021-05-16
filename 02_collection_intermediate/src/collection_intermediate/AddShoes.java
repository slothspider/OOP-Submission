package collection_intermediate;

import java.util.Random;
import java.util.Scanner;

public class AddShoes {
	public static String createID() {
		String temp = "SH";
		Random rand = new Random();
		temp = temp + Integer.toString(rand.nextInt(9));
		temp = temp + Integer.toString(rand.nextInt(9));
		temp = temp + Integer.toString(rand.nextInt(9));
		return temp;
	}
	public static void add() {
		Scanner scan = new Scanner(System.in);
		
		String name = null;
		Boolean isFalse = true;
		do {
			System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]: ");
			try {
				name = scan.nextLine();
				if (name.endsWith("shoe")) {
					isFalse = false;
				}
				
			} catch(Exception e) {
				scan.nextLine();
				
			}
		} while (isFalse);
		
		String category = null;
		isFalse = true;
		do {
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			try {
				category = scan.nextLine();
				if (category.contentEquals("Sneaker") || category.contentEquals("Running") || category.contentEquals("Boot")) {
					isFalse = false;
				}
				
			} catch(Exception e) {
				scan.nextLine();
				
			}
		} while (isFalse);
		
		Integer dd = 0, mm = 0, yyyy = 0;
		isFalse = true;
		do {
			System.out.print("Input shoe's release date[dd-mm-yyyy]: ");
			try {
				String temp = scan.nextLine();
				String[] numbers = temp.split("-");
				
				dd = Integer.parseInt(numbers[0]);
				mm = Integer.parseInt(numbers[1]);
				yyyy = Integer.parseInt(numbers[2]);
				
				if ( (dd >= 1 && dd <= 30) && (mm >= 1 && mm <= 12) && (yyyy >= 2000 && yyyy <= 2020) ) {
					isFalse = false;
				}
				
			} catch(Exception e) {

			}
		} while (isFalse);
		
		Integer price = 0;
		isFalse = true;
		do {
			System.out.print("Input shoe's price[more than or equals to 5000]: ");
			try {
				price = scan.nextInt();
				scan.nextLine();
				if ( price >= 5000 ) {
					String ID = createID();
					Shoes.add(new Shoes(ID, name, category, dd, mm, yyyy, price));
					isFalse = false;
				}
				
			} catch(Exception e) {
				scan.nextLine();
				
			}
		} while (isFalse);
				
		System.out.println("Shoe added!");
		System.out.println("Press enter to continue...");
		scan.nextLine();
	}
}
