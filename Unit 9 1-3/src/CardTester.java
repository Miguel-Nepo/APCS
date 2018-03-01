/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace","Spades",1);
		Card card2 = new Card("Jack","Hearts",10);
		Card card3 = new Card("Three","Clubs",3);
		System.out.print(card1);
		System.out.print(card2);
		System.out.print(card3);
		
	}
}
