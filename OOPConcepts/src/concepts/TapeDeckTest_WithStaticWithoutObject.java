package concepts;

public class TapeDeckTest_WithStaticWithoutObject {
		static TapeDeck t;
	public static void main(String[] args) {
		
		//this case t can be used to call TapeDeck methods but it will throw a NullPointerException
		//because TapeDeck t without assignment with new keyword and a constructor is treated as null value
		// t can call TapeDeck methods because instance t from TapeDeck class is static
		//in static main method
		t.canRecord = true;
		t.playTape();
		if(t.canRecord == true) {
			t.recordTape();
		}

	}

}
