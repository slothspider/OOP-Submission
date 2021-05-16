package Collection_Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Participants {
	static ArrayList<Participants> Par = new ArrayList<>();
	
	String name;
	Integer num;
	
	Participants(String name, Integer num){
		this.name = name;
		this.num = num;
	}
	
	public static boolean exist(String username) {
		for (Participants i : Par) {
			if (username.equals(i.name)) {
				return true;
			}
		}
		return false;
	}
	
	public static void add(String username, Integer num) {
		Par.add(new Participants(username, num));
	}
	
	public static void showList() {
		System.out.println("+========================================+");
		System.out.println("+ Share List                             +");
		System.out.println("+========================================+");
		for (Participants i : Par) {
			System.out.print("|");
			Utils.padding(5, String.valueOf(Par.indexOf(i) + 1));
			System.out.print("|");
			Utils.padding(22, i.name);
			
			System.out.print("|");
			Utils.padding(11, i.num.toString());
			
			System.out.println("|");
		}
		System.out.println("+========================================+");
	}
	
	public static Integer size() {
		return Par.size();
	}
	
	public static void set(Integer indexOld, Integer a) {
		Participants temp = new Participants(Par.get(indexOld).name, a);
		Par.set(indexOld, temp);
	}
	
	public static void delete(int a) {
		Par.remove(a);
	}
	
}
