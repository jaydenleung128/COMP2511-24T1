package thrones;

public class Game {
    
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character king = factory.buildKing();
        Character queen = factory.buildQueen();
        Character knight = factory.buildKnight();
        Character dragon = factory.buildDragon();
        knight.attack(dragon);
    }

}