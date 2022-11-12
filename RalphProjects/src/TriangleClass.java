
public class TriangleClass {

	double side1 = 1.0; 
	double side2 = 1.0; 
	double side3 = 1.0; 
	
	TriangleClass() {}
	
	TriangleClass(double side1, double side2, double side3) {
		this.side1 = side1; 
		this.side2 = side2; 
		this.side3 = side3; 
	}
	
	public double getSide1() {
		return side1; 
	}
	
	public double getSide2() {
		return side2; 
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea(double base, double height) {
		double area = (base * height)/2;
		return area; 
	}
	
	public double getPerimeter(double a, double b, double c) {
		double perimeter = a + b + c; 
		return perimeter; 
	}
	
	@Override
	public String toString() {
		return "Triangle: side 1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
	}

}
