package abstractFactoryPattern;

class LightThemeFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public TextField createTextField() {
        return new LightTextField();
    }
}