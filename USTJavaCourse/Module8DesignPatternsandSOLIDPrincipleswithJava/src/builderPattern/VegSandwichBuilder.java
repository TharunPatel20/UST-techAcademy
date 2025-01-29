package builderPattern;

//Concrete Builder 1 - Veg Sandwich
class VegSandwichBuilder implements SandwichBuilder {
	private Sandwich sandwich;

	public VegSandwichBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void buildBread() {
		sandwich.setBread("Whole wheat");
	}

	@Override
	public void buildVegetables() {
		sandwich.setVegetables("Lettuce, Tomato, Cucumber");
	}

	@Override
	public void buildMeats() {
		sandwich.setMeats("No meat");
	}

	@Override
	public void buildSauces() {
		sandwich.setSauces("Mayonnaise");
	}

	@Override
	public Sandwich getSandwich() {
		return sandwich;
	}
}
