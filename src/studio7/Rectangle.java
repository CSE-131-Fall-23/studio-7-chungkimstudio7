package studio7;

/**
 * The Rectangle class represents a rectangle with a specified length and width.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructs a new Rectangle with the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets the length of the rectangle.
     *
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     *
     * @return The perimeter of the rectangle.
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Checks if this rectangle is smaller in terms of area than another rectangle.
     *
     * @param other The other rectangle to compare with.
     * @return true if this rectangle is smaller, false otherwise.
     */
    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    /**
     * Checks if the rectangle is a square (length equals width).
     *
     * @return true if the rectangle is a square, false otherwise.
     */
    public boolean isSquare() {
        return length == width;
    }

    /**
     * Draws the rectangle (implementation required).
     */
    public void draw() {
        // Implement a method to draw the rectangle (you can use graphics libraries like StdDraw)
    }

    /**
     * A sample main method for testing the Rectangle class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 3.0);

        System.out.println("Rectangle 1 Area: " + rectangle1.getArea());
        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());

        System.out.println("Is Rectangle 1 smaller than Rectangle 2? " + rectangle1.isSmallerThan(rectangle2));
        System.out.println("Is Rectangle 2 a square? " + rectangle2.isSquare());
    }
}
