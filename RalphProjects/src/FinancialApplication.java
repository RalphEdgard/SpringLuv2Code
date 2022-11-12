
public class FinancialApplication {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double userInput = scan.nextDouble(); 
		
		double firstMonth = userInput * (1+0.003125);
		double eachMonth = (100 + firstMonth) * (1+0.003125);
		String[] array = { "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth", "eleventh", "twelfth" };
		double temp = 0; 
		
		System.out.println("After the first month, the account value is: " + firstMonth);
		System.out.println("After the second month, the account value is: " + eachMonth);
		
		for (int i = 0; i < 11; i++) {
			if (i == 10) {
				break;
			}
			
			eachMonth = (100 + eachMonth) * (1+0.003125);
			System.out.println("After the " + array[i] + " month, the account value is " + eachMonth);
		}
	}
}
