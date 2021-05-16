package Collection_Easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

	public static void title() {
		try {
			File title = new File("Title");
			Scanner reader = new Scanner(title);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void printMenu() {
		System.out.println("+=======================+");
		System.out.println("+ Options               +");
		System.out.println("+=======================+");
		System.out.println("+ 1. Start Sharing      +");
		System.out.println("+ 2. Update Participant +");
		System.out.println("+ 3. Delete Participant +");
		System.out.println("+ 4. Close App          +");
		System.out.println("+=======================+");
		System.out.print("Choice >> ");
	}
	
	public static void padding(int a, String b) {
		int rightPadding = a - b.length() - 1;
				
		System.out.print(" " + b);
		for (int i=0 ; i<rightPadding ; i++) {
			System.out.print(" ");
		}
	}
		
}
