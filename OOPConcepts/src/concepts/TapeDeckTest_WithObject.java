package concepts;

public class TapeDeckTest_WithObject {

	public static void main(String[] args) {
	TapeDeck t = new TapeDeck(); //creating an object from TapeDeck class
	
	//calling methods from TapeDeck class using object t
	t.canRecord = true;
	t.playTape();
	if(t.canRecord == true) {
		t.recordTape();
	}

	}

}
