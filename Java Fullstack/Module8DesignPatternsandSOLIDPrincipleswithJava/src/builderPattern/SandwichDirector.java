package builderPattern;

//Director class
class SandwichDirector {
	private SandwichBuilder builder;

	public SandwichDirector(SandwichBuilder builder) {
		this.builder = builder;
	}

	// Construct the sandwich using builder methods
	public void constructSandwich() {
		builder.buildBread();
		builder.buildVegetables();
		builder.buildMeats();
		builder.buildSauces();
	}
}
