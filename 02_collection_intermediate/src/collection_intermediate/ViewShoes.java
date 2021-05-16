package collection_intermediate;

import java.util.Scanner;

public class ViewShoes {
	public static void view() {
		Scanner scan = new Scanner(System.in);
		if (Shoes.size() > 0) {
			Shoes.showList();
			
		} else {
			System.out.println("No shoes available..");
						
		}
		System.out.print("Press enter to continue..");
		scan.nextLine();
	}
}
