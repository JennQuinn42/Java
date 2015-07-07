/* - All sizes are metric ie. mm 
 * -create a wheel size
 * -create start point
 * -create current position
 * -turn wheel
 * -update current position
 * -increment distance traveled
 * -time the lap
 * -average speed from time
 * -add turns (basically simply temp reduces wheelTurnAngle @ trackPos: see scrub)
 * -add 6 cars
 * -add start sequence
 * -add finish sequence (winner info car info etc)

 */



public class RaceCar {

	public static void main(String[] args) {
		
		//car states
		//float  pi = 3.1415926535F;
		double wheelCircumf = 1000D; //wheel circumference of 1000mm (1m) for simplicity
		double wheelAngleInDegrees = 0D;
		double revolutions = 0D;
		double currentPos = 0;
		double EnginePower = 0.8;
		double tyreWear = 0D;
		boolean engineOn;
		
		//track states
		double trackLength =  900000D; // track length 1km
		int numTurns = 6; //speed decrease multiplier
		boolean raining;
		double trackScrub = 0.02; //speed decrease multiplier
		
		long startTime = System.currentTimeMillis();//start timer
		
		for(double wheelAngleinDegrees = 0D;wheelAngleInDegrees < 360D;){
			wheelAngleInDegrees++;
			if(wheelAngleInDegrees == 360D & currentPos < trackLength){
				wheelAngleInDegrees = 0D;
				revolutions++;
			}
			tyreWear = revolutions * trackScrub; //overall time decrease multiplier
			currentPos = revolutions * wheelCircumf * EnginePower;
			System.out.println(wheelAngleInDegrees);
			System.out.print(currentPos + " ");
			

		}
		
		long endTime = System.currentTimeMillis();//end timer
		System.out.println("\nRace Over !!!");
		double millsToSecs = 1000D;
		System.out.println("\nCrossed Finish Line in " + (endTime - startTime) / millsToSecs + " Seconds");
		System.out.println("Average Speed: " + (trackLength) / (endTime - startTime) + " kph" );//dunno how to round down?
		System.out.println("Tyre Wear: " + tyreWear);
		
		

	}

}
