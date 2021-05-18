package concertApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AudienceController {
	
	public void registerAudience(ArrayList<Audience> audiences) {
		Scanner scan = new Scanner(System.in);
		Validation v = new Validation();
		Boolean isFalse = true;
		
		String name, id, friend, idFriend;
		do {
			isFalse = true;
			System.out.print("Audience Name [2-20 characters]: ");
			name = scan.nextLine();
			isFalse = v.audienceName(name) ? false : true;
			
		} while (isFalse);
		
		do {
			isFalse = true;
			System.out.print("Ticket ID [5 digits number]: ");
			id = scan.nextLine();
			isFalse = (v.audienceTicket(id, audiences)) ? false : true;
		
		} while (isFalse);
		
		do {
			isFalse = true;
			System.out.print("Do you have a friend in the queue [yes/no]? ");
			friend = scan.nextLine();
			if (v.hasFriend(friend)) {
				isFalse = false;
				boolean yes = friend.contentEquals("yes") ? true : false;
				if (yes && audiences.isEmpty()) {
					System.out.println("There is no queue!");
					isFalse = true;
				} else if (yes) {
					do {
						System.out.print("Friend's Ticket ID [5 digits number]: ");
						idFriend = scan.nextLine();
					} while(!v.audienceInTheQueue(idFriend, audiences));
				}			
			}
		} while (isFalse);
		
		audiences.add(new Audience(name, id));
		System.out.println("ADD DATA SUCCESS !!!");
	}

	public void enterHall(ArrayList<Audience> audiences) {
		if (audiences.isEmpty()) {
			System.out.println("There's no item to search, please insert new data");
		} else {
			System.out.println(audiences.get(0).getName() + " enter the Concert Hall");
			audiences.remove(0);				
		}
		
	}

	Integer getQueueNumber(String id, ArrayList<Audience> audiences) {
		Integer q = -1;
		for (Audience i : audiences) {
			if (i.getId().contentEquals(id)) {
				q = audiences.indexOf(i);
			}
		}
		return q;
	}
	
	public void SearchQueue(ArrayList<Audience> audiences) {
		if (audiences.isEmpty()) {
			System.out.println("There's no item to search, please insert new data");
		} else {
			Scanner scan = new Scanner(System.in);
			String ticketID;
			boolean isFalse;
			do {
				isFalse = true;
				System.out.print("Ticket ID [5 digits number]: ");
				ticketID = scan.nextLine();
				if (!(getQueueNumber(ticketID, audiences) == -1)) {
					System.out.println("Queue Number : " + (getQueueNumber(ticketID, audiences)+1));	
					isFalse = false;
				}
			} while (isFalse);
			
		}
		
	}

	public void UpdateAudience(ArrayList<Audience> audiences) {
		Scanner scan = new Scanner(System.in);
		Validation v = new Validation();
		String ticketID;
		boolean isFalse;
		
		do {
			isFalse = true;
			System.out.print("Ticket ID [5 digits number]: ");
			ticketID = scan.nextLine();
			if (v.audienceInTheQueue(ticketID, audiences)) {
				isFalse = false;
			}
		} while (isFalse);
		
		do {
			isFalse = true;
			String name;
			System.out.print("Audience Name [2-20 characters]: ");
			name = scan.nextLine();
			if (v.audienceName(name)) {
				isFalse = false;
				Audience a = new Audience(name, ticketID);
				audiences.set(getQueueNumber(ticketID, audiences), a);
			}
			
		} while (isFalse);
		
	}

	public void popAll(ArrayList<Audience> audiences) {
		audiences.clear();
	}

	public void showList(ArrayList<Audience> audiences) {
		Utils u = new Utils();
		System.out.println("======================");
		System.out.println(" FT World Tour Concert");
		System.out.println("======================");
		System.out.println("");
		
		if (audiences.isEmpty()) {
			return;
		}
		
		System.out.println("         Name          TicketID ");
		System.out.println("================================");
		for (Audience i : audiences) {
			u.padding(22, i.getName());
			u.padding(10, "   " + i.getId());
			System.out.println("");
		}
		System.out.println("");
	}
	
}
