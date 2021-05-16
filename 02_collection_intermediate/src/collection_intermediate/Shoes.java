package collection_intermediate;

import java.util.ArrayList;

public class Shoes {
static ArrayList<Shoes> S = new ArrayList<>();
	
	String ID, name, category;
	Integer dd, mm, yyyy, price;
	
	Shoes(String ID, String name, String category, Integer dd, Integer mm, Integer yyyy, Integer price){
		this.ID = ID;
		this.name = name;
		this.category = category;
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
		this.price = price;
	}
	
	public static Integer size() {
		return S.size();
	}
	
	public static void showList() {
		for (Shoes i : S) {
			System.out.printf("%d %s-%s\n", S.indexOf(i)+1, i.name, i.ID);
			System.out.println("=================");
			System.out.println("Category: " + i.category);
			System.out.printf("Release date: %02d-%02d-%d\n", i.dd, i.mm, i.yyyy);
			System.out.println("Price : " + i.price);
			System.out.println("");
		}
	}
	
	public static void add(Shoes a) {
		S.add(a);
	}
	
	public static void delete(int a) {
		S.remove(a);
	}
}
