package concepts;

public class TapeDeckTest_WithStatic {
	
	static TapeDeck t; // instantiated an initializer t but making it a static
	
	public static void main(String[] args) {
		// t is assigned to new keyword and constructor TapeDeck() to create an object t
		t = new TapeDeck();
		//t is now an object therefore it can be used to call TapeDeck methods
		t.canRecord = true;
		t.playTape();
		if(t.canRecord == true) {
			t.recordTape();
		}
	

	}

}
