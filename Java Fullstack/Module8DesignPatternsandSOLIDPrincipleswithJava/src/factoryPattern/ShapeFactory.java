package factoryPattern;

public class ShapeFactory {
	public static  Shape getShapeFactory(double radius) {
		return new Circle(radius);
	}
	 public static Shape getShapeFactory(double min, double max) {
			return new Ellipse(min,max);
	}
}
