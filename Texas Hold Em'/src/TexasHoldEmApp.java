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

		//select random suit and card for dealing
		for(int i = 0;i < 4;++i){
			int randomDeck = rand.nextInt(4);
			int randomCard = rand.nextInt(13);
			if(randomDeck == 0){
				if(diamonds.cards[randomCard] = true){				//duplicate check
					randomCard = rand.nextInt(13);
				}
				diamonds.cards[randomCard] = true;
			}else{
				if(randomDeck == 1){
					if(hearts.cards[randomCard] = true){				//duplicate check
						randomCard = rand.nextInt(13);
					}
					hearts.cards[randomCard] = true;
				}else{
					if(randomDeck == 2){
						if(spades.cards[randomCard] = true){				//duplicate check
							randomCard = rand.nextInt(13);
						}
						spades.cards[randomCard] = true;
					}else{
						if(randomDeck == 3){
							if(clubs.cards[randomCard] = true){				//duplicate check
								randomCard = rand.nextInt(13);
							}
							clubs.cards[randomCard] = true;
						}
					}
				}
			}


		}









	}
}
