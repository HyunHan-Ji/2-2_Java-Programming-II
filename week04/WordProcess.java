package week04;

public class WordProcess {
	public static String search(Word[] word, String eng) {
		for(int i=0 ; i<word.length ; i++) {
			if(word[i].getEng().equals(eng)){
				return word[i].getKor();
			}
		}		
		return null;
	}
	
	public static void search(Word[] word, char ch) {
		int presence = 0;
		for(int i=0 ; i<word.length ; i++) {
			if(word[i].getEng().charAt(0) == ch) {
				System.out.println(word[i].toString());
				presence = 1;
			}
		}
		
		if(presence == 0) {
			System.out.println("¾øÀ½");
		}
	}	
}
