package studio7;

/**
 * The Complex class represents a complex number with real and imaginary parts.
 */
public class Complex {
    private double real;
    private double imaginary;

    /**
     * Constructs a new Complex number with the specified real and imaginary parts.
     *
     * @param real      The real part of the complex number.
     * @param imaginary The imaginary part of the complex number.
     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Adds this complex number to another complex number and returns a new complex number as the sum.
     *
     * @param other The complex number to add.
     * @return The sum of the two complex numbers.
     */
    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    /**
     * Multiplies this complex number by another complex number and returns a new complex number as the product.
     *
     * @param other The complex number to multiply by.
     * @return The product of the two complex numbers.
     */
    public Complex multiply(Complex other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(productReal, productImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

