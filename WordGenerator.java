
/**
 * This class to count number of words.
 * 
 * by  atif hazim 
 *
 */
public class WordGenerator {

	public int countTotalWords(String sentence) {
		int numberofwords=0;
		for(int i = 0; i < sentence.length()-1; i++) {  
			//Counts all the spaces present in the string  
			//It doesn't include the first space as it won't be considered as a word  
			if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
				numberofwords++;  
			}  
		}  
		//To count the last word present in the string, increment wordCount by 1  
		numberofwords++;  

		return numberofwords;

	}
} 
