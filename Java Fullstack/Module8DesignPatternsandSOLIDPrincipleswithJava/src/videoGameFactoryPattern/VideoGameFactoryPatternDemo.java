package videoGameFactoryPattern;

import java.util.Scanner;

public class VideoGameFactoryPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose your character: ");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            GameCharacter character = null;
            
            switch (choice) {
                case 1:
                    character = CharacterFactory.createCharacter("warrior");
                    break;
                case 2:
                    character = CharacterFactory.createCharacter("mage");
                    break;
                case 3:
                    character = CharacterFactory.createCharacter("archer");
                    break;
                case 4:
                    System.out.println("Exiting game...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }
            
            character.attack();
        }
    }
}
