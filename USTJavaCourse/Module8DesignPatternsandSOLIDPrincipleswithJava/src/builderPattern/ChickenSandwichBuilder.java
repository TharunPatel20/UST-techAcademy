package builderPattern;

//Concrete Builder 2 - Chicken Sandwich
class ChickenSandwichBuilder implements SandwichBuilder {
	private Sandwich sandwich;

	public ChickenSandwichBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void buildBread() {
		sandwich.setBread("White bread");
	}

	@Override
	public void buildVegetables() {
		sandwich.setVegetables("Lettuce, Tomato");
	}

	@Override
	public void buildMeats() {
		sandwich.setMeats("Grilled Chicken");
	}

	@Override
	public void buildSauces() {
		sandwich.setSauces("BBQ Sauce");
	}

	@Override
	public Sandwich getSandwich() {
		return sandwich;
	}
}
