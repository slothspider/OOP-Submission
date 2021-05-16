package Collection_Easy;

import java.util.Scanner;

public class Delete {
	public static void delete() {
		Integer size = Participants.size();
		if (size > 0) {
			Scanner scan = new Scanner(System.in);
			
			Integer search = 0;
			Boolean isFalse = true;
			do {
				Participants.showList();
				System.out.print("Which participant you would like to delete ");
				System.out.printf("[1 - %d][0 to exit]? ", size);
				try {
					search = scan.nextInt();
					if (search >= 1 && search <= size) {
						Participants.delete(search-1);
						System.out.println("Participant successfully removed from event");
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
			
		}
	}
}
