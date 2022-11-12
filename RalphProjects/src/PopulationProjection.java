
public class PopulationProjection {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter speed: ");
		double userInput1 = scan.nextDouble(); 
		
		System.out.print("Enter the acceleration: ");
		double userInput2 = scan.nextDouble();
		
		double length = Math.pow(userInput1, 2)/(2*userInput2);
		System.out.print("The minimum ranway length length for this airplain is: " + length);
	}
}
