import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class Bank {
	public static void main(String[] args) { 

		Scanner input = new Scanner(System.in);
		
	    try {
	        File myObj = new File("/Users/rruiz33/eclipse-workspace/RalphProjects/src/Accounts.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	          
	          try {
	              FileWriter myWriter = new FileWriter("/Users/rruiz33/eclipse-workspace/RalphProjects/src/Accounts.txt");
	              
	              System.out.print("Enter a name: ");
	              String name = input.next();
	              
	              System.out.print("Enter initial amount: ");
	              double money = input.nextDouble();
	              
	      		  int accountNumber = (int)(Math.random() * 1000000);
	              
	      		  Account ralph = new Account(name, money, accountNumber);
	      		  
	              myWriter.write("Name: " + ralph.getName() + "\nAccount Number: " + ralph.getAccountNumber() + "\nMoney: " + ralph.getMoney());
	              myWriter.close();
	              System.out.println("Successfully wrote to the file.");
	              
	            } catch (IOException e) {
	              System.out.println("An error occurred.");
	              e.printStackTrace();
	            }
	          
	        } else {
	          System.out.println("File exists.");
              FileWriter myWriter = new FileWriter("/Users/rruiz33/eclipse-workspace/RalphProjects/src/Accounts.txt");
              
              System.out.print("Enter a name: ");
              String name = input.next();
              
              System.out.print("Enter initial amount");
              double money = input.nextDouble();
              
      		  int accountNumber = (int)(Math.random() * 1000000);
              
      		  Account ralph = new Account(name, money, accountNumber);
      		  
              myWriter.write("Name: " + ralph.getName() + "\nAccount Number: " + ralph.getAccountNumber() + "\nMoney: " + ralph.getMoney());
              myWriter.close();
              System.out.println("Successfully wrote to the file.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	} // public static void enter
} 

