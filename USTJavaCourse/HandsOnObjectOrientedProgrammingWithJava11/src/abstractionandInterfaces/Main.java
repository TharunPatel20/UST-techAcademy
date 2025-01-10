package abstractionandInterfaces;
//un-implimented methods are present in interface
interface Shape {
    double calculateArea();
    void displayShapeInfo();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Circle with radius: " + radius);
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayShapeInfo();
        System.out.println("Area: " + circle.calculateArea());

        rectangle.displayShapeInfo();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
