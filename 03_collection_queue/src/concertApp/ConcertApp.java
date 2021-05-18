package concertApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcertApp {
	public ConcertApp (boolean onApp){
		Scanner scan = new Scanner(System.in);
		ArrayList<Audience> audiences = new ArrayList<Audience>();
		Utils ut = new Utils();
		AudienceController ac = new AudienceController();
		
		while(onApp) {
			ut.printMenu(audiences);
			
			int choice = 0;
			
			do {
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 1 || choice > 5);
			
			switch(choice) {
			case 1:
				ac.registerAudience(audiences);
				break;
			case 2:
				ac.enterHall(audiences);
				break;
			case 3:
				ac.SearchQueue(audiences);
				break;
			case 4:
				ac.UpdateAudience(audiences);
				break;
			case 5:
				ac.popAll(audiences);
				onApp = false;
				break;
			}
			
		}
		
		scan.close();
	}
	
	public static void main(String[] args) {
		new ConcertApp(true);
	}

}
