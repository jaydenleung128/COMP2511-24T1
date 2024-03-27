package thrones;

import java.util.Random;

public class CharacterFactory {
    private Random rand = new Random();

    public Character buildDragon() {
        return new Dragon(generateRandomLocation(), generateRandomLocation());
    }
    
    public Character buildKing() {
        return new King(generateRandomLocation(), generateRandomLocation());
    }
    
    public Character buildKnight() {
        return new Knight(generateRandomLocation(), generateRandomLocation());
    }
    
    public Character buildQueen() {
        return new Queen(generateRandomLocation(), generateRandomLocation());
    }
    
    private int generateRandomLocation() {
        return rand.nextInt() % 5;
    }
}
