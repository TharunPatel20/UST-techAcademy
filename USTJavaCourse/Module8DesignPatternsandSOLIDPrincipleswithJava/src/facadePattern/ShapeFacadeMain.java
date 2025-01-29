package facadePattern;

import java.util.Scanner;

public class ShapeFacadeMain {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        ShapeFacade shapeFacade = new ShapeFacade();

	        boolean run = true;
	        while (run) {
	            System.out.println("\n-- MENU --");
	            System.out.println("1. Circle");
	            System.out.println("2. Ellipse");
	            System.out.println("3. Exit");
	            System.out.print("Select option: ");
	            int choice = scan.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter radius of Circle: ");
	                    double radius = scan.nextDouble();
	                    shapeFacade.calculateCircle(radius);
	                    break;
	                case 2:
	                    System.out.print("Enter long radius of Ellipse: ");
	                    double longRadius = scan.nextDouble();
	                    System.out.print("Enter short radius of Ellipse: ");
	                    double shortRadius = scan.nextDouble();
	                    shapeFacade.calculateEllipse(longRadius, shortRadius);
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    run = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
	            }
	        }
	        scan.close();
	    }
	}
