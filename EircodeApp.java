package EircodeApp;

import java.util.Scanner;

public class EircodeApp {

	public static void main(String[] args) {
		EircodeApp ea = new EircodeApp();
		ea.runApp();
	}
	
	private void runApp(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello World!");
		
		String[] eircode = {"D02 Y006","D04 C932","D15 XR2R","D03 RR27","D24 H510"};
		String[] addresses = {"5 Merrion Square North, Dublin 2","10 Burlington Road, Dublin 4",
				"Dunsink Observatory, Dunsink Lane, Dublin 15","26 Kincora Road, Clontarf, Dublin 3",
				"Partas 4A Brookfield Enterprise Centre, Dublin 24"};
		
		System.out.println("Please Enter Eircode: ");
		String eircodeInput = scan.nextLine();
		System.out.println(eircodeInput);
		
		
		
		
		
		
		
	}

}

