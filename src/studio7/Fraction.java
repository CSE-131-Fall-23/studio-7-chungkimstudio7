package studio7;

import java.util.Objects;

/**
 * The Fraction class represents a fraction with a numerator and denominator.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructs a new Fraction with the specified numerator and denominator.
     *
     * @param numerator   The numerator of the fraction.
     * @param denominator The denominator of the fraction (must be non-zero).
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Adds this fraction to another fraction and returns a new fraction as the sum.
     *
     * @param other The fraction to add.
     * @return The sum of the two fractions.
     */
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    /**
     * Multiplies this fraction by another fraction and returns a new fraction as the product.
     *
     * @param other The fraction to multiply by.
     * @return The product of the two fractions.
     */
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    /**
     * Returns the reciprocal of this fraction as a new fraction.
     *
     * @return The reciprocal of this fraction.
     */
    public Fraction reciprocal() {
        return new Fraction(this.denominator, this.numerator);
    }

    /**
     * Simplifies this fraction by finding the greatest common divisor (GCD) of the numerator and denominator
     * and dividing both by the GCD.
     *
     * @param fraction The fraction to simplify.
     * @return The simplified fraction.
     */
    private Fraction simplify(Fraction fraction) {
        int gcd = gcd(fraction.numerator, fraction.denominator);
        return new Fraction(fraction.numerator / gcd, fraction.denominator / gcd);
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of the two integers.
     */
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * A sample main method for testing the Fraction class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        Fraction sum = fraction1.add(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction reciprocal = fraction1.reciprocal();

        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Reciprocal of Fraction 1: " + reciprocal);
    }
}
