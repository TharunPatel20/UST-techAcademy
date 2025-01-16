package theMuseumTourOrganizer;

public class Exhibit {
	String name;
	int id;
	
	public Exhibit(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name +" (#" + id + ")";
	}
	
}
