import java.util.Scanner;

/**Class to demonstrate String equalsIgnoreCase
 * 
 */

/**
 * @author peter
 *
 */
public class EqualsIgnoreCaseApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 1; ++i){
			System.out.println("Please enter your password: ");
			String password = scan.next();
			System.out.println("Please repeat: ");
			String passCheck = scan.next();

			boolean bol = password.equalsIgnoreCase(passCheck);
			if(bol == true){
				System.out.println("Password set!");
				System.out.println("1) Reset Password \n2) Quit \nPlease Choose?");
				int resetPass = scan.nextInt();
				if(resetPass == 1){
					--i;
				}

			}else{

				System.out.println("Password mismatch, try again");
				--i;
			}
		}
	}
}
