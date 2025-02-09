package factoryPattern;

class Circle implements Shape{

	private double radius; 
	
	Circle(double radius){	
		this.radius=radius;
	}
	
	@Override
	public double perimeterCalculation() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double areaCalculation() {
		return Math.PI * radius*radius;
	}
}
