package concertApp;

public class Audience {
	private String name, id;
	
	// Constructor
	public Audience(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
		
}
