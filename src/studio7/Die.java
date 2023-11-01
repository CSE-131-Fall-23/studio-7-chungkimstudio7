package studio7;

import java.util.Random;
/**
 * The Die class represents a die with a specified number of sides.
 */
public class Die {
    private int sides;
    private Random random;

    /**
     * Constructs a new Die with the specified number of sides.
     *
     * @param sides The number of sides on the die.
     */
    public Die(int sides) {
        this.sides = sides;
        random = new Random();
    }

    /**
     * Rolls the die and returns a random integer in the range [1..sides].
     *
     * @return A random integer representing the roll result.
     */
    public int roll() {
        return random.nextInt(sides) + 1;
    }

    /**
     * A sample main method for testing the Die class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Die sixSidedDie = new Die(6);
        Die twelveSidedDie = new Die(12);

        System.out.println("Rolling a 6-sided die: " + sixSidedDie.roll());
        System.out.println("Rolling a 12-sided die: " + twelveSidedDie.roll());
    }
}
