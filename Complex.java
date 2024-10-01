/*
2.    Print the sum, difference and product of two complex numbers by creating a class,
		named 'Complex' with separate methods for each operation whose real and imaginary parts are
		entered by user.Use Constructors to initialize the data members.
*/

package assignment_4;

public class Complex {
	    private double real;
	    private double imaginary;

	    
	    public Complex(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	    
	    public Complex add(Complex other) {
	        double realSum = this.real + other.real;
	        double imaginarySum = this.imaginary + other.imaginary;
	        return new Complex(realSum, imaginarySum);
	    }

	    
	    public Complex subtract(Complex other) {
	        double realDifference = this.real - other.real;
	        double imaginaryDifference = this.imaginary - other.imaginary;
	        return new Complex(realDifference, imaginaryDifference);
	    }

	    
	    public Complex multiply(Complex other) {
	        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
	        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
	        return new Complex(realProduct, imaginaryProduct);
	    }

	    
	    public void display() {
	        if (imaginary >= 0)
	            System.out.println(real + " + " + imaginary + "i");
	        else
	            System.out.println(real + " - " + Math.abs(imaginary) + "i");
	    }

	    public static void main(String[] args) {
	        
	        Complex c1 = new Complex(4, 5);  // 4 + 5i
	        Complex c2 = new Complex(3, -2); // 3 - 2i

	        
	        Complex sum = c1.add(c2);
	        System.out.print("Sum: ");
	        sum.display();

	       
	        Complex difference = c1.subtract(c2);
	        System.out.print("Difference: ");
	        difference.display();

	        
	        Complex product = c1.multiply(c2);
	        System.out.print("Product: ");
	        product.display();
	    }
	}

	


