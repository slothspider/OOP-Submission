package Collection_Easy;

import java.util.Scanner;

public class Update {
	
	public static void update() {
		Integer size = Participants.size();
		if (size > 0) {
			Scanner scan = new Scanner(System.in);
			
			Integer search = 0;
			Boolean isFalse = true;
			do {
				Participants.showList();
				System.out.print("Which participant you would like to update ");
				System.out.printf("[1 - %d][0 to exit]? ", size);
				try {
					search = scan.nextInt();
					if (search >= 1 && search <= size) {
						isFalse = false;
					} else if (search == 0) {
						return;
					}
					scan.nextLine();
				} catch(Exception e) {
					scan.nextLine();
					System.out.println("input must be a numeric");
				}
				
			} while (isFalse);
			
			Integer num = 0;
			isFalse = true;
			do {
				System.out.print("Input a number [0 - 100](inclusive): ");
				try {
					num = scan.nextInt();
					if (num >= 0 && num <= 100) {
						isFalse = false;
					}
					scan.nextLine();
				} catch(Exception e) {
					scan.nextLine();
					System.out.println("input must be a numeric");
				}
			} while (isFalse);
			Participants.set(search-1, num);
			System.out.println("Update Successful!");
		}
	}
	
}
