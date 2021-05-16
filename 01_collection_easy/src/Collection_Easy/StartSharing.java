package Collection_Easy;

import java.util.Scanner;

public class StartSharing {
	
	public static void startSharing() {
		Scanner scan = new Scanner(System.in);
		
		Integer num = 0;
		Boolean isFirstFalse = true;
		do {
			System.out.print("Input a number [0 - 100](inclusive): ");
			try {
				num = scan.nextInt();
				if (num >= 0 && num <= 100) {
					isFirstFalse = false;
				}
				scan.nextLine();
			} catch(Exception e) {
				scan.nextLine();
				System.out.println("input must be a numeric");
			}
		} while (isFirstFalse);
		
		String username;
		Boolean isSecondFalse = true;
		do {
			System.out.print("Could you give me your username [5 - 20 characters]? ");
			try {
				username = scan.nextLine();
				if (username.length() >= 5 && username.length() <= 20) {
										
					if (!Participants.exist(username)) {
						Participants.add(username, num);
						System.out.printf("You are the %d that joins the game\n", Participants.size());
						System.out.printf("You share number : %d\n", num);
						isSecondFalse = false;
					} else {
						System.out.println("username has already been taken!!");
					}
				}
			} catch(Exception e) {
				scan.nextLine();
			}
		} while (isSecondFalse);
	}
	
}
