import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the QB First Name: ");
		String oneName =  userInput.nextLine();
		
		System.out.println("Enter the Last Name: ");
		String twoName =  userInput.nextLine();
		
		System.out.println("Enter the Number of Attempts: ");
		double attempt =  userInput.nextDouble();
		
		System.out.println("Enter the Number of Complete Passes: ");
		double complete = userInput.nextDouble();
	
		System.out.println("Enter the Number of Interceptions: ");
		double inter = userInput.nextDouble();
		
		System.out.println("Enter the Number of Yards: ");
		double yords = userInput.nextDouble();
		
		System.out.println("Enter the Number of Touchdowns: ");
		double downtouch = userInput.nextDouble();
	
		/* System.out.println("Quarterback First Name: " + oneName);
		System.out.println("Quarterback Last Name: " + twoName);
		System.out.println("Attempts: " + attempt);
		System.out.println("Complete Passes: " + complete);
		System.out.println("Interceptions: " + inter);
		System.out.println("Yards: " + yords);
		System.out.println("Touch Downs: " + downtouch);
		*/
		
		QB Juan = new QB(oneName, twoName, inter, attempt, yords, complete, downtouch);
		
		Juan.setRating();
		Juan.getProfile();
		
		
		
	}
}
