package videoGameFactoryPattern;

class Mage implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }
}