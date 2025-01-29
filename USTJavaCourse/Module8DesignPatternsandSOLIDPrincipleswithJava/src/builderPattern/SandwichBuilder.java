package builderPattern;

//Builder interface
interface SandwichBuilder {
	void buildBread();

	void buildVegetables();

	void buildMeats();

	void buildSauces();

	Sandwich getSandwich();
}
