package Introducton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
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
		System.out.println("1. Start The Simulation!!");
		System.out.println("2. Close App");
		System.out.print("Choice >> ");
	}
	
	public static void padding(int a, String b) {
		int leftPadding = ( a - b.length() ) / 2;
		int rightPadding = a - b.length() - leftPadding;
		
		
		for (int i=0 ; i<leftPadding ; i++) {
			System.out.print(" ");
		}
		System.out.print(b);
		for (int i=0 ; i<rightPadding ; i++) {
			System.out.print(" ");
		}
	}
	
	public static void dataType(Integer a, Integer b) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("+==========================================================================================================================+");
		System.out.println("+  + (String type)  |  (Character Type)  |  * ( Integer type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
		System.out.println("+==========================================================================================================================+");
		
		System.out.print("+");
		padding(19, a.toString() + " + " + b.toString());
		System.out.print("|");
		
		padding(20, (char)(int)a + "   " + (char)(int)b);
		System.out.print("|");
		
		Integer c = a*b;
		padding(21, c.toString());
		System.out.print("|");
		
		Float d = (float) (a/b);
		padding(21, d.toString());
		System.out.print("|");
		
		Boolean e = a == b;
		padding(37, e.toString());
		System.out.println("+");
		
		System.out.println("+==========================================================================================================================+");
		System.out.println("Press enter to proceed..");
		scan.nextLine();
		
	}
	
	public static void arithmetic(Integer a, Integer b) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("+===========================================================+");
		System.out.println("+ Data Type : Integer                                       +");
		System.out.println("+===========================================================+");
		System.out.println("+     +     |     -     |     *     |     /     |     %     +");
		System.out.println("+===========================================================+");
		
		System.out.print("+");
		Integer c = a+b;
		padding(11, c.toString());
		System.out.print("|");
		
		c = a-b;
		padding(11, c.toString());
		System.out.print("|");
		
		c = a*b;
		padding(11, c.toString());
		System.out.print("|");
		
		c = a/b;
		padding(11, c.toString());
		System.out.print("|");
		
		c = a%b;
		padding(11, c.toString());
		System.out.println("+");
		
		System.out.println("+===========================================================+");
		
		System.out.println("Press enter to proceed..");
		scan.nextLine();
	}
	
	public static void logicalTable(Boolean a, Boolean b) {
		String p1 = a.toString();
		String p2 = b.toString();
		System.out.println("+=====================================================================+");
		System.out.println("+ Logical Table                                                       +");
		System.out.println("+=====================================================================+");
		System.out.printf("+ P1 = %s , P2 = %s                                                     +\n", p1.substring(0, 1).toUpperCase(), p2.substring(0, 1).toUpperCase());
		System.out.println("+=====================================================================+");
		System.out.println("+       !P1       |       !P2       |       &&       |       ||       +");
		System.out.println("+=====================================================================+");
		
		System.out.print("+");
		Boolean c = !a;
		padding(17, c.toString());
		System.out.print("|");
		
		c = !b;
		padding(17, c.toString());
		System.out.print("|");
		
		c = a && b;
		padding(16, c.toString());
		System.out.print("|");
		
		c = a || b;
		padding(16, c.toString());
		System.out.println("+");
		
		System.out.println("+=====================================================================+");
	}
	
	public static void simulation() {
		Scanner scan = new Scanner(System.in);
		
		Integer firstNum = 0;
		Boolean isFirstFalse = true;
		do {
			System.out.print("Input the first number [1 - 100](inclusive): ");
			try {
				firstNum = scan.nextInt();
				if (firstNum >= 1 && firstNum <= 100) {
					isFirstFalse = false;
				}
				scan.nextLine();
			} catch(Exception e) {
				scan.nextLine();
			}
		} while (isFirstFalse);
		
		Integer secondNum = 0;
		Boolean isSecondFalse = true;
		do {
			System.out.print("Input the second number [1 - 100](inclusive): ");
			try {
				secondNum = scan.nextInt();
				if (secondNum >= 1 && secondNum <= 100) {
					isSecondFalse = false;
				}
				scan.nextLine();
			} catch(Exception e) {
				scan.nextLine();
			}
		} while (isSecondFalse);
		
		dataType(firstNum, secondNum);
		arithmetic(firstNum, secondNum);
		
		Boolean firstBool = null;
		Boolean isFirstBoolFalse = true;
		do {
			System.out.print("Give me value for p1 [true | false]: ");
			try {
				firstBool = scan.nextBoolean();
				isFirstBoolFalse = false;
				scan.nextLine();
			} catch(Exception e) {
				scan.nextLine();
			}
		} while (isFirstBoolFalse);
		
		
		Boolean secondBool = null;
		Boolean isSecondBoolFalse = true;
		do {
			System.out.print("Give me value for p2 [true | false]: ");
			try {
				secondBool = scan.nextBoolean();
				isSecondBoolFalse = false;
				scan.nextLine();
			} catch(Exception e) {
				scan.nextLine();
			}
		} while (isSecondBoolFalse);
		
		logicalTable(firstBool, secondBool);
		
	}
	
	private static void exit() {
		System.out.println("thank you for using the apps!!");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		title();
		
		Integer choice = 0;
		do {
			printMenu();
			
			choice = 0;
			choice = scan.nextInt();
			
			if (choice == 1) {
				simulation();
				
			} else if (choice == 2) {
				exit();
				
			}
		} while (choice != 2);
		
		scan.close();
	}

}
