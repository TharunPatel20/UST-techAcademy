package builderPattern;

//Product class - Sandwich
class Sandwich {
	private String bread;
	private String vegetables;
	private String meats;
	private String sauces;

	// Setters for each component
	public void setBread(String bread) {
		this.bread = bread;
	}

	public void setVegetables(String vegetables) {
		this.vegetables = vegetables;
	}

	public void setMeats(String meats) {
		this.meats = meats;
	}

	public void setSauces(String sauces) {
		this.sauces = sauces;
	}

	// Method to display the sandwich details
	public void showSandwich() {
		System.out.println("Sandwich with: " + bread + " bread, " + vegetables + " vegetables, " + meats
				+ " meats, and " + sauces + " sauces.");
	}
}
