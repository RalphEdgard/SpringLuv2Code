
public class AdditionQuiz {
	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis()%10);
		int number2 = (int)(System.currentTimeMillis()/10%10);
		int number3 = (int)(Math.random()*10);
		System.out.println("Number 1: " + number1 + "\nNumber 2: " + number3);
	}
}
