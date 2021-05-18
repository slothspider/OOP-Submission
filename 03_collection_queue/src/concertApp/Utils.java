package concertApp;

import java.util.ArrayList;

public class Utils {
	AudienceController ac = new AudienceController();
	void printMenu(ArrayList<Audience> audiences) {
		ac.showList(audiences);		
		System.out.println("1. Register New Audience");
		System.out.println("2. Enter the Concert Hall");
		System.out.println("3. Search Queue Number");
		System.out.println("4. Update Audience Data");
		System.out.println("5. Exit");
		System.out.print("Input : ");
	}
	
	void padding(int a, String b) {
		int rightPadding = a - b.length();
				
		System.out.print(b);
		for (int i=0 ; i<rightPadding ; i++) {
			System.out.print(" ");
		}
	}
}
