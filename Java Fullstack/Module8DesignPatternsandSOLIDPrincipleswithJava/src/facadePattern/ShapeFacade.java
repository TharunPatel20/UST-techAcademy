package facadePattern;

class ShapeFacade {
    public void calculateCircle(double radius) {
        Shape circle = new Circle(radius);
        System.out.println("Circle:");
        System.out.println(" - Perimeter: " + String.format("%.2f", circle.perimeterCalculation()));
        System.out.println(" - Area: " + String.format("%.2f", circle.areaCalculation()));
    }

    public void calculateEllipse(double longRadius, double shortRadius) {
        Shape ellipse = new Ellipse(longRadius, shortRadius);
        System.out.println("Ellipse:");
        System.out.println(" - Perimeter: " + String.format("%.2f", ellipse.perimeterCalculation()));
        System.out.println(" - Area: " + String.format("%.2f", ellipse.areaCalculation()));
    }
}

