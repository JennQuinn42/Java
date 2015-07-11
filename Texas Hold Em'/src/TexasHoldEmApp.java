import java.util.Random;
import java.util.Scanner;

public class TexasHoldEmApp {

	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println("Dealers cards: ");

		Deck cardSuit = new Deck();
		Deck diamonds = new Deck();
		Deck hearts = new Deck();
		Deck spades = new Deck();
		Deck clubs = new Deck();
		Deck dealerDiamonds = new Deck();
		Deck dealerHearts = new Deck();
		Deck dealerSpades = new Deck();
		Deck dealerClubs = new Deck();
		Deck playerDiamonds = new Deck();
		Deck playerHearts = new Deck();
		Deck playerSpades = new Deck();
		Deck playerClubs = new Deck();
		Deck pcPlayerDiamonds = new Deck();
		Deck pcPlayerHearts = new Deck();
		Deck pcPlayerSpades = new Deck();
		Deck pcPlayerClubs = new Deck();

		double pot = 0.00;

		//select random suit and card for dealer
		for(int i = 0;i <= 4;i++){
			int randomDeck = rand.nextInt(4);
			int randomCard = rand.nextInt(13);


			if(randomDeck == 0 && (diamonds.cards[randomCard] == false)){
				diamonds.cards[randomCard] = true;
				dealerDiamonds.cards[randomCard] = true;
			}else{
				if(randomDeck == 1 && (hearts.cards[randomCard] == false)){
					hearts.cards[randomCard] = true;
					dealerHearts.cards[randomCard] = true;
				}else{
					if(randomDeck == 2 && (spades.cards[randomCard] == false)){
						spades.cards[randomCard] = true;
						dealerSpades.cards[randomCard] = true;
					}else{
						if(randomDeck == 3 && (clubs.cards[randomCard] == false)){
							clubs.cards[randomCard] = true;
							dealerClubs.cards[randomCard] = true;
						}else{
							--i;
						}
					}
				}
			}

			System.out.println("Deck "+ randomDeck + " Card " + randomCard);
		}
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Your name: ");
		String nameInput = scan.next();
		Player gamePlayer = new Player();
		Player pcPlayer = new Player();
		gamePlayer.setPlayerName(nameInput);
		
		System.out.println("Welcome " + gamePlayer.playerName + ", let's play some Texas Hold Em' Poker!");
		System.out.println("Today you'll be sat against one opponent (Max) - best of luck!");
		System.out.println("Your Starting chip ballance is: €" + gamePlayer.playerChips);
		System.out.println("note: a [B] beside your name is the Dealer Button");
		System.out.println("Starting game . . . Blinds are €5, €10");

		//Select random suit and cards from cards left for players
		for(int i = 0;i <= 1;i++){
			int randomDeck = rand.nextInt(4);
			int randomCard = rand.nextInt(13);


			if(randomDeck == 0 && (diamonds.cards[randomCard] == false)){
				playerDiamonds.cards[randomCard] = true;
				diamonds.cards[randomCard] = true;
			}else{
				if(randomDeck == 1 && (hearts.cards[randomCard] == false)){
					playerHearts.cards[randomCard] = true;
					hearts.cards[randomCard] = true;
				}else{
					if(randomDeck == 2 && (spades.cards[randomCard] == false)){
						playerSpades.cards[randomCard] = true;
						spades.cards[randomCard] = true;
					}else{
						if(randomDeck == 3 && (clubs.cards[randomCard] == false)){
							playerClubs.cards[randomCard] = true;
							clubs.cards[randomCard] = true;
						}else{
							--i;
						}
					}
				}
			}

		}//end player card loop
		
		
		//Select random deck and cards for PC Player
		for(int i = 0;i <= 1;i++){
			int randomDeck = rand.nextInt(4);
			int randomCard = rand.nextInt(13);


			if(randomDeck == 0 && (diamonds.cards[randomCard] == false)){
				pcPlayerDiamonds.cards[randomCard] = true;
				diamonds.cards[randomCard] = true;
			}else{
				if(randomDeck == 1 && (hearts.cards[randomCard] == false)){
					pcPlayerHearts.cards[randomCard] = true;
					hearts.cards[randomCard] = true;
				}else{
					if(randomDeck == 2 && (spades.cards[randomCard] == false)){
						pcPlayerSpades.cards[randomCard] = true;
						spades.cards[randomCard] = true;
						
					}else{
						if(randomDeck == 3 && (clubs.cards[randomCard] == false)){
							pcPlayerClubs.cards[randomCard] = true;
							clubs.cards[randomCard] = true;
						}else{
							--i;
						}
					}
				}
			}

		}//end PC player card loop
		
		
		
		boolean gameIsRunning = true;
		while(gameIsRunning){
			for(int i = 0;i <= 1;++i){
				
			}
			
			
			
			
			
			
			
		}//end gameIsRunning






//				System.out.print("\n");
//		
//				for(boolean j:diamonds.cards){
//					System.out.println(j );
//				}
//				System.out.println("\n");
//				for(boolean k:hearts.cards){
//					System.out.println(k );
//				}
//				System.out.println("\n");
//				for(boolean l:spades.cards){
//					System.out.println(l);
//				}
//				System.out.println("\n");
//				for(boolean m:clubs.cards){
//					System.out.println(m );
//				}



	}










}
