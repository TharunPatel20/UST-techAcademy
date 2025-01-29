package factoryPattern;

import java.util.Scanner;

public class ShapeFactoryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println(" --MENU--");
            System.out.println("1. Circle");
            System.out.println("2. Ellipse");
            System.out.println("3. Exit");
            System.out.print("Select here: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    handleCircleMenu(scan);
                    break;
                case 2:
                    handleEllipseMenu(scan);
                    break;
                case 3:
                    System.out.println("Exit successful.");
                    run = false;
                    break;
                default:
                    System.out.println("Please select a valid option (1-3).");
            }
        }
        scan.close();
    }

    private static void handleCircleMenu(Scanner scan) {
        while (true) {
            System.out.println(" --Circle Calculation--");
            System.out.println("1. Perimeter");
            System.out.println("2. Area");
            System.out.println("3. Back to Menu");
            System.out.print("Select here: ");
            
            int option = scan.nextInt();
            if (option == 3) break;

            System.out.print("Enter radius: ");
            double radius = scan.nextDouble();
            Shape circle = ShapeFactory.getShapeFactory(radius);

            switch (option) {
                case 1:
                    System.out.println("Perimeter of Circle = " + String.format("%.2f", circle.perimeterCalculation()));
                    break;
                case 2:
                    System.out.println("Area of Circle = " + String.format("%.2f", circle.areaCalculation()));
                    break;
                default:
                    System.out.println("Please select a valid option (1-3).");
            }
        }
    }

    private static void handleEllipseMenu(Scanner scan) {
        while (true) {
            System.out.println(" --Ellipse Calculation--");
            System.out.println("1. Perimeter");
            System.out.println("2. Area");
            System.out.println("3. Back to Menu");
            System.out.print("Select here: ");

            int option = scan.nextInt();
            if (option == 3) break;

            System.out.print("Enter minor radius: ");
            double minorRadius = scan.nextDouble();
            System.out.print("Enter major radius: ");
            double majorRadius = scan.nextDouble();
            Shape ellipse = ShapeFactory.getShapeFactory(majorRadius, minorRadius);

            switch (option) {
                case 1:
                    System.out.println("Perimeter of Ellipse = " + String.format("%.2f", ellipse.perimeterCalculation()));
                    break;
                case 2:
                    System.out.println("Area of Ellipse = " + String.format("%.2f", ellipse.areaCalculation()));
                    break;
                default:
                    System.out.println("Please select a valid option (1-3).");
            }
        }
    }
}
