package builderPattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		// Building a Veg Sandwich
		SandwichBuilder vegBuilder = new VegSandwichBuilder();
		SandwichDirector director = new SandwichDirector(vegBuilder);
		director.constructSandwich();
		Sandwich vegSandwich = vegBuilder.getSandwich();
		vegSandwich.showSandwich(); // Display the Veg Sandwich

		// Building a Chicken Sandwich
		SandwichBuilder chickenBuilder = new ChickenSandwichBuilder();
		SandwichDirector director2 = new SandwichDirector(chickenBuilder);
		director2.constructSandwich();
		Sandwich chickenSandwich = chickenBuilder.getSandwich();
		chickenSandwich.showSandwich(); // Display the Chicken Sandwich
	}
}
