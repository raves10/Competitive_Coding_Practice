import java.util.List;

public class SearchSuggestionApp {
	
	public static void main(String[] args)
	{
		/* String[] products= {"mobile","mouse","moneypot","monitor","mousepad"}; */
		String[] products={"havana"};
		/* String[] products={"bags","baggage","banner","box","cloths"}; */
		SearchSuggestionProducts obj= new SearchSuggestionProducts();
		/* String searchWord ="mouse"; */
		/* String searchWord ="havana"; */
		/* String searchWord ="bags"; */
		String searchWord ="tatiana";
		List<List<String>> output=obj.getSuggestedProducts(products, searchWord);
		System.out.println(output.toString());
	}

}
