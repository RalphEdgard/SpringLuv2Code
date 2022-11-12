
interface Animal {
	
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
	
	public void animalSound() {
		System.out.println("I am sleeping");
	}
	public void sleep() {
		System.out.println("lol what is up");
	}
}

abstract class GeometricObject extends Object {
	//date fields
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructors
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	abstract double getArea();
	//getter
	public String getColor()
	{
		return color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	//setter
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	//override toString
	public String toString()
	{
		return "Created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}
}

class Circle extends GeometricObject implements Comparable <Object> {
	//data field
	double radius;
	
	//constructors
	public Circle(){
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	//getter
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public double getPerimeter()
	{
		return 2 * radius;
	}
	public double getDiameter()
	{
		return 2 * radius * Math.PI;
	}
	//setter
	public void setRadius( double radius)
	{
		this.radius = radius;
	}
	//print the Circle
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;	
	}
	
	@Override
	public boolean equals(Object o) {
		return false; 
	}
}

class Octagon extends GeometricObject implements Comparable<Object>, Cloneable {

	private double side = 0; 
	
	Octagon() {}
	
	Octagon(double side) {
		this.side = side; 
	}
	
	public double getSide() {
		return side; 
	}
	
	public void setSide(double side) {
		this.side = side; 
	}
	
	public double getArea() {
		double area = (2+(4/Math.sqrt(2))) * Math.pow(side, 2);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 8*side; 
		return perimeter; 
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2*width+2*height;
    }

    @Override
    public String toString() {
        return "Rectangle["+width+","+height+"]Area:"+getArea()+",Circumference:"+getCircumference();
    }
}

public class TestPage {
	public static void main(String[] args) {

		Octagon oct = new Octagon(5); 
		Rectangle rec = new Rectangle(3,3); 
		Circle cir = new Circle(9);
		
		GeometricObject[] arrayOfShapes = { oct, rec, cir };
	
		System.out.print("Area of octagon: " + oct.getArea() + "\nArea of rectangle: " + rec.getArea() + "\nArea of Circle: " + cir.getArea() + "\nSum of all Areas: " + sumArea(arrayOfShapes));

	} public static void registerSlayer(DoomSlayer slayerRecruit) {
		System.out.println("Hello " + slayerRecruit.playerName + " your health is " + slayerRecruit.health + " and your weapon is " + slayerRecruit.weapons);
	} public static void m(Object x) {
		System.out.println(x.toString());
	} public static double sumArea(GeometricObject[] a) {
		double sumOfAllAreas = 0; 
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof GeometricObject) {
				sumOfAllAreas = a[i].getArea() + sumOfAllAreas; 
			}
		}
		return sumOfAllAreas; 
	}
}

class DoomSlayer extends SuperSlayer {
	String playerName = null; 
	int health = 1000; 
	String weapons = null; 
	
	public DoomSlayer () {}
	
	public DoomSlayer (String playerName, int health, String weapons, boolean angelWings) {
		super(angelWings);
		this.playerName = playerName; 
		this.health = health; 
		this.weapons = weapons; 
	}
	
	public String playerName() {
		return playerName;
	}
	
	public int health() {
		return health; 
	}
	
	public String weapons() {
		return weapons;
	}
	public void p(double i) {
		System.out.println(i*2);
	}
	
}

class SuperSlayer {
	boolean angelWings = true;
	
	public SuperSlayer() {}
	
	public SuperSlayer (boolean angelWings) {
		this.angelWings = angelWings; 
	}
	
	public boolean getAngelWings() {
		return angelWings; 
	}
	
	public void setAngelWingsOff(boolean angelWings) {
		this.angelWings = angelWings; 
	}
	
	public void p(double i) {
		System.out.println(i);
	}
}

class GraduateStudent extends Student {
	
}

class Student extends Person {
	@Override 
	public String toString() {
		return "String";
	}
}
class Person extends Object {
	@Override 
	public String toString() {
		return "Person";
	}
}

class MyStack {
	
	private java.util.ArrayList<Object> ralphList = new java.util.ArrayList<Object>();
	
	public boolean isEmpty() {
		return ralphList.isEmpty();
	}
	
	public int getSize() {
		return ralphList.size();
	}
	
	public Object peek() {
		return ralphList.get(getSize());
	}
	
	public Object pop() {
		Object obj = ralphList.get(getSize());
		ralphList.remove(getSize());
		return obj;
	}
	
	public void push(Object o) {
		ralphList.add(o);
	}
	
}