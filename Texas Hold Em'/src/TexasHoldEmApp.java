import java.util.Random;

public class TexasHoldEmApp {

	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println("Dealers cards: ");

		Deck dealerCards = new Deck();
		Deck diamonds = new Deck();
		Deck hearts = new Deck();
		Deck spades = new Deck();
		Deck clubs = new Deck();

		int randomCard = 0;
		for(int i = 0;i < 4;++i){
			//select random suit for dealing
			int randomDeck = rand.nextInt(4);

			//select random card for dealing
			for(int j = 5;i > 0; --j){		
				 randomCard = rand.nextInt(12);//number of elements in card array
				if(randomCard == 0){
					randomCard = rand.nextInt(12);
				}
			}




			//Array to face
			if(randomCard == 11){
				System.out.print("J");
			}else{
				if(randomCard ==12){
					System.out.print("Q");
				}else{
					if(randomCard==13){
						System.out.print("K");
					}else{
						if(randomCard==14){
							System.out.print("A");
						}else{
							System.out.print(randomCard);
						}
					}
				}
			}





		}









	}
}
