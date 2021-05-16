package collection_intermediate;

import java.util.Scanner;

public class DeleteShoes {
	public static void delete() {
		Scanner scan = new Scanner(System.in);
		
		Integer size = Shoes.size();
		
		if (Shoes.size() > 0) {	
			Integer search = 0;
			Boolean isFalse = true;
			do {
				Shoes.showList();
				System.out.printf("Choose shoe's number to delete[1..%d]: ", size);
				try {
					search = scan.nextInt();
					if (search >= 1 && search <= size) {
						Shoes.delete(search-1);
						System.out.println("Shoe removed!");
						isFalse = false;
					} else if (search == 0) {
						return;
					}
					scan.nextLine();
				} catch(Exception e) {
					scan.nextLine();

				}
				
			} while (isFalse);
			
		} else {
			System.out.println("No shoes available..");
			System.out.print("Press enter to continue..");
			scan.nextLine();
		}

	}
}
