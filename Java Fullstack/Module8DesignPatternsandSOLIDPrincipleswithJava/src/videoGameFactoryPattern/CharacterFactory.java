package videoGameFactoryPattern;


class CharacterFactory {
    public static GameCharacter createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("Invalid character type: " + type);
        }
    }
}

