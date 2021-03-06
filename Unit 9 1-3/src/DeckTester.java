/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[]{"Ace","Jack","Three"};
		String[] suits = new String[]{"Spades","Clubs"};
		int[] values = new int[]{1,10,3};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.isEmpty());
		//Test to see if size() works
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		//Test to see if the deck shuffles
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		String[] ranks2 = new String[]{"Ace","Jack","Three","Four","Five","Seven"};
		String[] suits2 = new String[]{"Spades","Clubs","Diamonds","Hearts"};
		int[] values2 = new int[]{1,10,3,4,5,7};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println(deck2.deal());
		System.out.println(deck2);
		
		String[] ranks3 = new String[]{"Ace","Jack","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		String[] suits3 = new String[]{"Spades"};
		int[] values3 = new int[]{1,10,3,4,5,6,7,8,9,10};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println(deck3);
		
	}
}
