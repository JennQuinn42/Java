package EircodeApp;

import java.util.Scanner;

public class EircodeApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		EircodeApp ea = new EircodeApp();
		ea.runApp();
	}

	private void runApp(){

		//		System.out.println("Hello World!");

		//Set up relating [] to store the eircode and corresponding addressses
		String[] eircode = {"D02 Y006","D04 C932","D15 XR2R","D03 RR27","D24 H510"};
		String[] addresses = {"5 Merrion Square North, Dublin 2","10 Burlington Road, Dublin 4",
				"Dunsink Observatory, Dunsink Lane, Dublin 15","26 Kincora Road, Clontarf, Dublin 3",
		"Partas 4A Brookfield Enterprise Centre, Dublin 24"};


		//ask user and get their required eircode
		System.out.println("Please Enter Eircode: ");
		String eircodeInput = scan.nextLine();
		System.out.println("You have entered: " + eircodeInput);


		eircodeInput = eircodeInput.toUpperCase();

		//If eircode is 7 characters long, add a space as the new 4th index
		if(eircodeInput.length() == 7){
			eircodeInput = eircodeInput.substring(0,3) + ' ' + eircodeInput.substring(3);
		}
		
		//Check if eircode is too small
		if(eircodeInput.length() < 7 || eircodeInput.length() > 8){
			System.out.println(eircodeInput + " is not a valid eircode.");
		}else{
			
			int elementFound = -1;

			//check if eircode is in our []
			for(int i = 0; i < eircode.length; i++){

				if(eircodeInput.equals(eircode[i])){

					elementFound = i;
					break;
				}
			}

			//if it's not found
			if(elementFound == -1){
				System.out.println("Sorry, eircode not found.");
			}else{//if it's found
				System.out.println(eircodeInput + " is " +addresses[elementFound]);
			}
		}
		scan.close();

	}

}
