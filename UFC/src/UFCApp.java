import java.util.Scanner;

public class UFCApp {

	private static final double POUND_TO_KG = 2.2062262;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double userWeight = 0.0;
		int choice = 1;

		System.out.print("1) Enter your weight in kg\n2) Enter your weight in llb's"
						+ "\nPlease select:");
		try{
		choice = scan.nextInt();
		}
		catch(Exception error){
			
		}
		
		System.out.print("Enter your weight: ");
		
		try{
		userWeight = scan.nextDouble();
		}
		catch(Exception error){
			
		}
		if(choice ==1){
			
		}//end if weight is in kg
		else if(choice ==2){
			userWeight = userWeight / POUND_TO_KG;
		}//end convert

		if (userWeight > 120){
			System.out.println("Sorry, you cant compete");
		}
		else if (userWeight > 93){
			System.out.println("You are Heavyweight");
		}
		else if (userWeight > 84){
			System.out.println("You are Light Heavyweight");
		}
		else if (userWeight > 77){
			System.out.println("You are Middleweight");
		}
		else if (userWeight > 70){
			System.out.println("You are Welterweight");
		}
		else if (userWeight > 66){
			System.out.println("You are Lightweight");
		}
		else {
			System.out.println("Sorry, you cant compete");
		}

	}//end main

}//end class
