package abstractFactoryPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Change the factory to switch themes
//        GUIFactory factory = new LightThemeFactory();
         GUIFactory factory = new DarkThemeFactory();

        // Create GUI components
        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        // Render components
        button.render();
        textField.display();
    }
}

