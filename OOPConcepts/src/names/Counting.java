package names;

public class Counting {

	public static void main(String[] args) {
		String counting = "A quick brown fox jumps over the lazy dog";
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;
		int consCount = 0;
		int blank = 0;
		int i;
		for(i = 0; i< counting.length();i++ ) {
			char currentChar = counting.charAt(i);
			if (vowels.indexOf(currentChar) >=0) 
				vowelCount++;
			else if(Character.isLetter(currentChar)) 
				consCount++;
			else blank++;
			}
		
			System.out.println("Vowels: "+vowelCount );
			System.out.println("Consonants: "+consCount );
			System.out.println("space: "+ blank);

	}

}
