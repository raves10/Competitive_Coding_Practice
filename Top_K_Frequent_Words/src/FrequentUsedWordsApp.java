import java.util.ArrayList;
import java.util.List;

public class FrequentUsedWordsApp {

	public static void main(String[] args) {
		
		FrequentUsedWords word=new FrequentUsedWords();
		int k = 2;
		List<String> keywords = new ArrayList<String>();
		keywords.add("anacell");
		keywords.add("betacellular");
		keywords.add("cetracular");
		keywords.add("deltacellular");
		keywords.add("eurocell");
		List<String> reviews = new ArrayList<String>();
		reviews.add("I love anacell Best services; Best services provided by anacell");
		reviews.add("betacellular has great services");
		reviews.add("deltacellular provides much better services than betacellular");
		reviews.add("cetracular is worse than anacell");
		reviews.add("Betacellular is better than deltacellular.");
		/*
		 * reviews.add("Anacell provides the best services in the city");
		 * reviews.add("betacellular has awesome services"); reviews.add(
		 * "Best services provided by anacell, everyone should use anacell");
		 */
		List<String> results= word.findFrequentWords(reviews, k, keywords);
		System.out.println("Most frequently used words are: "+results.toString());
				

	}
}
