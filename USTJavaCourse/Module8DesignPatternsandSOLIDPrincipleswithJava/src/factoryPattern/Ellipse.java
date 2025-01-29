package factoryPattern;

class Ellipse  implements Shape{
	double PI = Math.PI;
	private double shortRadius;
	private double longRadius;
	
	Ellipse (double shortRadius, double longRadius){
		this.shortRadius=shortRadius;
		this.longRadius=longRadius;
	}
	
	@Override
	public double perimeterCalculation() {
		return Math.PI * (3 * (longRadius + shortRadius) - Math.sqrt((3 * longRadius + shortRadius) * (longRadius + 3 * shortRadius)));
	}

	@Override
	public double areaCalculation() {
		return Math.PI * shortRadius * longRadius;
	}
}