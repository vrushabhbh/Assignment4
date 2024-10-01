/*
1.    Write a program to print the area and perimeter of a triangle 
having sides of 3, 4 and 5 units by creating a class named 'Triangle' with parameter in
its constructor.
*/

package assignment_4;

public class Triangle {
	int side1, side2, side3;
	double area, peri;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	void area() {
		area = 0.5 * side1 * side2;
	}

	void perimeter() {
		peri = side1 + side2 + side3;
	}

	void print() {
		System.out.println("Area:" + area);
		System.out.println("perimeter:" + peri);
	}

	public static void main(String[] args) {

		Triangle triangle = new Triangle(3, 4, 5);
		triangle.area();
		triangle.perimeter();
		triangle.print();

	}

}
