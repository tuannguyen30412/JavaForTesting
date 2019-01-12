package concepts;

public class TapeDeckTest_WithoutStatic {
	TapeDeck t; //instantiated an intializer t from class TapeDeck
	public static void main(String[] args) {
	
		//
		t = new TapeDeck();
		//cannot call TapeDeck methods because we have no object 
		// the TapeDeck methods below refer to the intializer t not an OBJECT t
		//because t is at class level not method level 
		t.canRecord = true;
		t.playTape();
		if(t.canRecord == true) {
			t.recordTape();
		}

	}

}
