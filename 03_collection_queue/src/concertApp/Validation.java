package concertApp;

import java.util.ArrayList;

public class Validation {
	
	boolean audienceName(String name) {
		return (name.length() >= 2 && name.length() <= 20) ? true : false;
	}
	
	boolean audienceInTheQueue(String id, ArrayList<Audience> audiences) {
		boolean ans = false;
		for (Audience i : audiences) {
			if (i.getId().contentEquals(id)) {
				ans = true;
				break;
			}
		}
		return ans;
	}
	
	boolean audienceTicket(String id, ArrayList<Audience> audiences) {
		boolean ans = false;
		ans = (id.length() == 5 && !audienceInTheQueue(id, audiences));
		if (ans) {
			for (int i=0 ; i<5 ; i++) {
				if ( id.charAt(i) < '0' || id.charAt(i) > '9'){
					ans = false;
				}
			}
		}
		return ans;
	}

	public boolean hasFriend(String friend) {
		return (friend.contentEquals("yes") || friend.contentEquals("no"));
	}

}
